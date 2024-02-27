package com.example.demo.entity;

import java.sql.Date;

public class Bill {
    private int id;
    private int bill_type;
    private int type;
    private int subtype;
        private Date bill_time;
    private float money;
    private String remark;
    private Date create_time;

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", bill_type=" + bill_type +
                ", type=" + type +
                ", subtype=" + subtype +
                ", bill_time=" + bill_time +
                ", money=" + money +
                ", remark='" + remark + '\'' +
                ", create_time=" + create_time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBill_type() {
        return bill_type;
    }

    public void setBill_type(int bill_type) {
        this.bill_type = bill_type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSubtype() {
        return subtype;
    }

    public void setSubtype(int subtype) {
        this.subtype = subtype;
    }

    public Date getBill_time() {
        return bill_time;
    }

    public void setBill_time(Date bill_time) {
        this.bill_time = bill_time;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getRemark() {
        return remark;
    }
}
