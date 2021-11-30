package com.example.demo.controllador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLogyCloud {
	private final static Logger logger= LoggerFactory.getLogger(ControllerLogyCloud.class);
	
	@Value("${some.value}")
	private String myValue;
	
	@GetMapping(path="/myValue")
	public String myValue() {
		return this.myValue;
	}
	@GetMapping("/")
	public ResponseEntity<String> index(){
		logger.info("Llamada al "+ myValue());
		return new ResponseEntity<String>(HttpStatus.OK).ok("Reto");
	}
}
