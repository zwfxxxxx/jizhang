package com.example.demo.mapper;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Group;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BillMapper {
    List<Bill> selectAll();
    List<Group> groupByType();
    int insertBill(Bill bill);
    int deleteBill(int id);


}
