package com.pragma.reportes.adapters.driven.mongodb.repository;

import com.pragma.reportes.domain.model.Report;
import org.mapstruct.Mapper;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportMongoRepository extends MongoRepository<Report, String> {
}
