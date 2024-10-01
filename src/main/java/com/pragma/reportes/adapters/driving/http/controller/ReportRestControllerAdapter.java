package com.pragma.reportes.adapters.driving.http.controller;

import com.pragma.reportes.adapters.driving.http.dto.AddReportRequest;
import com.pragma.reportes.adapters.driving.http.handlers.ReportHandler;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
@AllArgsConstructor
public class ReportRestControllerAdapter {

   private  final ReportHandler  reportHandler;


    @PostMapping("/create")
    public void addReport(@RequestBody AddReportRequest request) {
        reportHandler.addReport(request);
    }

}
