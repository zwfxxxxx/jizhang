package com.example.demo.entity;

import java.sql.Date;

public class Bill {
        private int id;
        private String bill_type;
        private int consume_type;
        private Date bill_time;
        private String money;
        private String remark;

        public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Date create_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }

    public int getConsume_type() {
        return consume_type;
    }

    public void setConsume_type(int consume_type) {
        this.consume_type = consume_type;
    }

    public Date getBill_time() {
        return bill_time;
    }

    public void setBill_time(Date bill_time) {
        this.bill_time = bill_time;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", bill_type='" + bill_type + '\'' +
                ", consume_type='" + consume_type + '\'' +
                ", bill_time=" + bill_time +
                ", money='" + money + '\'' +
                ", remark='" + remark + '\'' +
                ", create_time=" + create_time +
                '}';
    }
}
