package com.obut.currency.exc;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CurrencyExchangeController {
	@GetMapping("/currency-exchange/from/{from}/to/{to}") //parametre olarak vereceğimiz için usd ve ınr yi çevirdi
	//anatasyon olarak Path Variable kullandı
	
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to){
		return CurrencyExchange(1000L,from,to,BigDecimal.valueOf(50));;
	
		
	}
	
	
	
	
	
	

}
