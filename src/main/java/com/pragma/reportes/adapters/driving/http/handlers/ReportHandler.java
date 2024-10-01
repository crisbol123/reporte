package com.pragma.reportes.adapters.driving.http.handlers;

import com.pragma.reportes.adapters.driving.http.dto.AddReportRequest;
import com.pragma.reportes.adapters.driving.http.mapper.AddReportRequestMapper;
import com.pragma.reportes.domain.api.IReportServicePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReportHandler {
private final IReportServicePort reportServicePort;
private final AddReportRequestMapper addReportRequestMapper;

    public void addReport(AddReportRequest addReportRequest) {
        reportServicePort.addReport(addReportRequestMapper.toDomain( addReportRequest));
    }



}
