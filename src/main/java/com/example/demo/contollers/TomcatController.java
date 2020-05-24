package com.example.demo.contollers;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class TomcatController {
 
    @GetMapping("/hello")
    public Collection<String> sayHello() {
    	try {
			Thread.currentThread().sleep(10000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return IntStream.range(0, 10000)
          .mapToObj(i -> "Hello number " + i)
          .collect(Collectors.toList());
    }
}
