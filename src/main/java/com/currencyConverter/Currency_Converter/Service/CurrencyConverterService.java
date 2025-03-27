package com.currencyConverter.Currency_Converter.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyConverterService {


    @Value("${currency.api.key}")
    private String apiKey;

    @Value("${currency.api.url}")
    private String apiUrl;


    private final  RestTemplate restTemplate=new RestTemplate();

    public String getConverted(String from, String to,Double amount){
        String url=String.format("%s/%s/pair/%s/%s/%s",apiUrl,apiKey,from,to,amount);
        return restTemplate.getForObject(url, String.class);

    }



}
