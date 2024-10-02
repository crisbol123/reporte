package com.pragma.reportes.adapters.driven.mongodb.adapter;

import com.pragma.reportes.adapters.driven.mongodb.repository.ReportMongoRepository;
import com.pragma.reportes.domain.model.Report;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

 class ReportAdapterTest {

    @Mock
    private ReportMongoRepository reportMongoRepository;

    @InjectMocks
    private ReportAdapter reportAdapter;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
     void testAddReport() {
        // Arrange
        Report report = new Report(null, "test@example.com", 100.0, null);

        // Act
        reportAdapter.addReport(report);

        // Assert
        verify(reportMongoRepository).save(report);
    }
}