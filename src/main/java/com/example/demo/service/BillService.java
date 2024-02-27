package com.example.demo.service;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Group;
import com.example.demo.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    @Autowired
    private BillMapper billMapper;
    public List<Bill> selectAll(){
        return billMapper.selectAll();
    }
    public List<Group> groupByType(){
        return billMapper.groupByType();
    }
    public int insertBill(Bill bill){
        System.out.println(bill.toString());
        return billMapper.insertBill(bill);
    }
    public int deleteBill(int id){
        return billMapper.deleteBill(id);
    }

}
