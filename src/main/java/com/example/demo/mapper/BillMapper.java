package com.example.demo.mapper;

import com.example.demo.entity.Bill;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BillMapper {
    List<Bill> selectAll();
    List<Bill> groupByDay();
    int insertBill(Bill bill);
    int deleteBill(int id);

}
