//package com.example.springeurekaclientstockservice.service;
//
//mport static org.assertj.core.api.Assertions.assertThat;
//
//
//
//import java.util.ArrayList;
//
//import java.util.List;
//
//
//
//import org.junit.Test;
//
//import org.junit.runner.RunWith;
//
//import org.mockito.InjectMocks;
//
//import org.mockito.Mock;
//
//import org.mockito.Mockito;
//
//import org.springframework.boot.test.context.SpringBootTest;
//
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.springeurekaclientstockservice.dto.StockDto;
//import com.example.springeurekaclientstockservice.entity.Stock;
//import com.example.springeurekaclientstockservice.repository.StockRepository;
//
//
//
//
//
//
//
//@RunWith(SpringRunner.class)
//
//@SpringBootTest
//
//@SuppressWarnings(value = { "all" })
//
//public class StockServiceTest {
//
//	
//
//	
//
//	@Mock
//
//	 StockRepository repository;
//
//	@InjectMocks
//
//	StockServiceImpl service;
//
//	
//
//	@Test
//
//	public void whileFetchingProducts() {
//
//		//List<Product> list = new ArrayList<>();
//
//		 Stock stock = new Stock();
//		 StockDto stockDto = new StockDto();
//
//		 stock.setPrice(100.0);
//		stock.setQuantity(10);
//		stock.setStockExchangeName("mumbai");
//		stock.setStockId(1);
//		stock.setStockName("sbi");
//		stock.setStockPercentage(20.0);
//		stock.setTrending(1);
//		 
//
//		 Mockito.when(repository.findByStockId();
//
//		 List<Product> list1 = service.findByGroupId(product.getGroupId());
//
//		 assertThat(list).isEqualTo(list1);
//
//		
//
//	}
//
//
//
//}