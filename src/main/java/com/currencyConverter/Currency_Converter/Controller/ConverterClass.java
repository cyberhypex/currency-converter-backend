package com.currencyConverter.Currency_Converter.Controller;

import com.currencyConverter.Currency_Converter.Service.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class ConverterClass {

    @Autowired
    private CurrencyConverterService currencyConverterService;


    @GetMapping("/exch/{from}/{to}/{amount}")
    public String exchangePairs(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable Double amount
    ){
        return currencyConverterService.getConverted(from,to,amount);
    }
}
