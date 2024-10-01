package com.pragma.reportes.domain.usecases;

import com.pragma.reportes.domain.api.IReportServicePort;
import com.pragma.reportes.domain.model.Report;
import com.pragma.reportes.domain.spi.ReportPersistencePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReportUseCase implements IReportServicePort {
private final ReportPersistencePort reportPersistencePort;
    @Override
    public void addReport(Report report) {
        reportPersistencePort.addReport(report);
    }
}
