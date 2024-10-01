package com.pragma.reportes.adapters.driving.http.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddArticleReportRequest {
private String name;
private int quantity;
private double unitPrice;
private double subTotal;
}
