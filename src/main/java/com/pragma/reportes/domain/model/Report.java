package com.pragma.reportes.domain.model;

import java.time.LocalDate;
import java.util.List;

public class Report {

    private List<ArticleReport> articles;
    private String email;
    private double totalCost;
    private LocalDate purchaseDate;


    public Report(List<ArticleReport> articles, String email, double totalCost, LocalDate purchaseDate) {
        this.articles = articles;
        this.email = email;
        this.totalCost = totalCost;
        this.purchaseDate = purchaseDate;
    }



    public List<ArticleReport> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleReport> articles) {
        this.articles = articles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }


}
