package com.patika.paycore.crowdfunding.model;

public class Reward {

    private String name;
    private String description;
    private Integer quota;
    private Double minimumFundAmount;
    private String estimatedDeliveryDate;

    public Reward() {
    }

    public Reward(String name, String description, Double minimumFundAmount, String estimatedDeliveryDate){
        this.name = name;
        this.description = description;
        this.minimumFundAmount = minimumFundAmount;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Double getMinimumFundAmount() {
        return minimumFundAmount;
    }

    public void setMinimumFundAmount(Double minimumFundAmount) {
        this.minimumFundAmount = minimumFundAmount;
    }

    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
}
