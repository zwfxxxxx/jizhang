package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Bill;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Billcontroller {
//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello";
//    }
    @Autowired
    private BillService billService;
    @GetMapping("/selectAll")
    public String selectAll(){
        JSONObject ret = new JSONObject();
        ret.put("code", 200);
        ret.put("data",new JSONObject());
        ret.getJSONObject("data").put("bill_list",billService.selectAll());
        return ret.toJSONString();
    }
    @GetMapping("/groupByDay")
    public String groupByDay(){
        JSONObject ret = new JSONObject();
        ret.put("code", 200000);
        ret.put("data",new JSONObject());
        ret.getJSONObject("data").put("bill_list",billService.groupByDay());
        return ret.toJSONString();
    }
    @PostMapping("/insertBill")
    public String insertBill(@RequestBody Bill bill){
        billService.insertBill(bill);
        JSONObject ret = new JSONObject();
        ret.put("code", 200);
        ret.put("msg", "操作成功");
        return ret.toJSONString();
    }
    @PutMapping("/deleteBill")
    public String deleteBill(int id){
        billService.deleteBill(id);
        JSONObject ret = new JSONObject();
        ret.put("code", 200);
        ret.put("msg", "操作成功");
        return ret.toJSONString();
    }
}
