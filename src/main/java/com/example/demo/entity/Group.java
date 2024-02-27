package com.example.demo.entity;

public class Group {
    private String CategoryName;
    private Float TotalMoney;

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public Float getMoney() {
        return TotalMoney;
    }

    public void setMoney(Float money) {
        this.TotalMoney = money;
    }
}
