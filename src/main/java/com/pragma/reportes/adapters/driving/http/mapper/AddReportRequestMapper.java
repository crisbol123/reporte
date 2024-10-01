package com.pragma.reportes.adapters.driving.http.mapper;

import com.pragma.reportes.adapters.driving.http.dto.AddReportRequest;
import com.pragma.reportes.domain.model.ArticleReport;
import com.pragma.reportes.domain.model.Report;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddReportRequestMapper {
@Mapping(target = "articles", source = "articles")
@Mapping(target = "purchaseDate", source = "purchaseDate")

    Report toDomain(AddReportRequest addReportRequest);


}
