package com.APIManager.bean;

public class User {
    private Integer ulId;

    private String ulName;

    public Integer getUlId() {
        return ulId;
    }

    public void setUlId(Integer ulId) {
        this.ulId = ulId;
    }

    public String getUlName() {
        return ulName;
    }

    public void setUlName(String ulName) {
        this.ulName = ulName == null ? null : ulName.trim();
    }
}