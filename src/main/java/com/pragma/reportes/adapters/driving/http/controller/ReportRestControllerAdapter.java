package com.pragma.reportes.adapters.driving.http.controller;

import com.pragma.reportes.adapters.driving.http.dto.AddReportRequest;
import com.pragma.reportes.adapters.driving.http.handlers.ReportHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
@AllArgsConstructor
public class ReportRestControllerAdapter {

    private final ReportHandler reportHandler;

    @Operation(summary = "Add a new report", description = "Creates a new report based on the provided data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Report created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PostMapping("/create")
    public void addReport(@RequestBody AddReportRequest request) {
        reportHandler.addReport(request);
    }
}
