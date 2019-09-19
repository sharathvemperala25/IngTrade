package com.example.springeurekaclientstockservice.controller;

import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.springeurekaclientstockservice.dto.PublicApiResponse;
import com.example.springeurekaclientstockservice.dto.StockDto;
import com.example.springeurekaclientstockservice.entity.Stock;
import com.example.springeurekaclientstockservice.exception.StockNotFoundException;
import com.example.springeurekaclientstockservice.service.StockService;
import com.google.common.base.Optional;




@RestController

@RequestMapping("/api")

@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })

public class StockController {



	/**

	 * slf4j Logger

	 */

	private final static Logger LOGGER = LoggerFactory.getLogger(StockController.class);

	

	@Autowired

	private StockService stockService;

	@Autowired

	RestTemplate restTemplate;
	

	/**

	 * @return ResponseEntity ListOfStock

	 */

	@GetMapping("/stocks")

	public ResponseEntity<String> getStocks(@RequestParam Long stockId){

		

		LOGGER.info("StockController :: getStockes() ");
		
		StockDto stock = stockService.getStock(stockId);
		
		if (Optional.of(stock).isPresent()) {

			throw new StockNotFoundException("Stock not found");

		}
		String stockName1 = stock.getStockName();
		//String stockName = "WFC";
		String response = restTemplate.exchange("https://financialmodelingprep.com/api/company/real-time-price/"+stockName1+"?datatype=json", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {

		}, stockId).getBody();


		

		//return new ResponseEntity<>(stockService.getStock(stockId), HttpStatus.OK);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@Bean

//	@LoadBalanced

	public RestTemplate restTemplate() {

		return new RestTemplate();

	}

	

}
