package com.example.springeurekaclientstockservice.service;

import java.util.List;

import com.example.springeurekaclientstockservice.dto.StockDto;

public interface StockService {

	StockDto getStock(Long stockId);
}
