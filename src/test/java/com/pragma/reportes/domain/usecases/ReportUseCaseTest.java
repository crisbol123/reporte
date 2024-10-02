package com.pragma.reportes.domain.usecases;

import com.pragma.reportes.domain.model.Report;
import com.pragma.reportes.domain.spi.ReportPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

 class ReportUseCaseTest {

    @Mock
    private ReportPersistencePort reportPersistencePort;

    @InjectMocks
    private ReportUseCase reportUseCase;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
     void testAddReport() {
        // Arrange
        Report report = new Report(null, "test@example.com", 100.0, null);

        // Act
        reportUseCase.addReport(report);

        // Assert
        verify(reportPersistencePort).addReport(report);
    }
}