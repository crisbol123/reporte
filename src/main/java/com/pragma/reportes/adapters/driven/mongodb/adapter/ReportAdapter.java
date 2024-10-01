package com.pragma.reportes.adapters.driven.mongodb.adapter;

import com.pragma.reportes.adapters.driven.mongodb.repository.ReportMongoRepository;
import com.pragma.reportes.domain.model.Report;
import com.pragma.reportes.domain.spi.ReportPersistencePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReportAdapter implements ReportPersistencePort {
private final ReportMongoRepository reportMongoRepository;
    @Override
    public void addReport(Report report) {
reportMongoRepository.save(report);
    }
}
