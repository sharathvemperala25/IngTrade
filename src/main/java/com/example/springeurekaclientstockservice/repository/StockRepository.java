package com.example.springeurekaclientstockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springeurekaclientstockservice.entity.Stock;
public interface StockRepository extends JpaRepository<Stock, Integer> {

	public Stock findByStockId(Long stockId);
}
