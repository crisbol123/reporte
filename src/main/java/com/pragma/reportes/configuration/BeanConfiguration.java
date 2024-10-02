package com.pragma.reportes.configuration;


import com.pragma.reportes.adapters.driven.feigns.adapter.UserFeignClientAdapter;
import com.pragma.reportes.adapters.driven.feigns.clients.UserFeignClient;
import com.pragma.reportes.adapters.driven.mongodb.adapter.ReportAdapter;
import com.pragma.reportes.adapters.driven.mongodb.repository.ReportMongoRepository;
import com.pragma.reportes.domain.api.IReportServicePort;
import com.pragma.reportes.domain.spi.ReportPersistencePort;
import com.pragma.reportes.domain.spi.UserFeignClientPort;
import com.pragma.reportes.domain.usecases.ReportUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final ReportMongoRepository reportMongoRepository;
    private final UserFeignClient userFeignClient;

    @Bean
    public ReportPersistencePort reportPersistencePort() {
        return new ReportAdapter(reportMongoRepository);
    }
    @Bean
    public IReportServicePort reportServicePort() {
        return new ReportUseCase(reportPersistencePort());
    }

    @Bean
    public UserFeignClientPort userFeignClientPort() {
        return new UserFeignClientAdapter(userFeignClient);
        }


}

