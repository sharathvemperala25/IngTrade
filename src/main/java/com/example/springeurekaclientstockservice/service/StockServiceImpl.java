package com.example.springeurekaclientstockservice.service;

import java.util.ArrayList;

import java.util.List;



import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.springeurekaclientstockservice.dto.StockDto;
import com.example.springeurekaclientstockservice.entity.Stock;
import com.example.springeurekaclientstockservice.repository.StockRepository;



@Service

public class StockServiceImpl implements StockService {



	/**

	 * slf4j Logger

	 */

	private final static Logger LOGGER = LoggerFactory.getLogger(StockServiceImpl.class);

	

	@Autowired

	private StockRepository stockRepository;

	

	/**

	 * return

	 */

	@Override

	public StockDto getStock(Long stockId) {

		Stock stock = stockRepository.findByStockId(stockId);
		StockDto stockDto = new StockDto();

		LOGGER.info("StockServiceImpl :: getStocks -- Copying stock -> stockDto ");

		BeanUtils.copyProperties(stock, stockDto);


		 return stockDto;

	}
}

