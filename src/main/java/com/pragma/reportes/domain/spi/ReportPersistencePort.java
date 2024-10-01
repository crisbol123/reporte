package com.pragma.reportes.domain.spi;

import com.pragma.reportes.domain.model.Report;

public interface ReportPersistencePort {
    void addReport(Report report);
}
