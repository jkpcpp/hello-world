package com.sgcc.uap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/hi")
    public String hi(@RequestParam String id){
        return restTemplate.getForObject("http://test-server-b/hi?id="+id, String.class);
    }
    
}
