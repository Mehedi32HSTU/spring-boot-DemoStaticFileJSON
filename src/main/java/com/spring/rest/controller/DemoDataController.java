package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.spring.rest.exception.ResourceNotFoundException;
import com.spring.rest.model.DemoData;
import com.spring.rest.repository.DemoDataRepository;

@RestController
@RequestMapping("/demodata")
public class DemoDataController {
	
	@Autowired
	DemoDataRepository demoDataRepository;
	ObjectMapper objectMapper = new ObjectMapper();
	
	@PostMapping(value="/send-request", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
//	@PostMapping(value="/send-request", consumes = {"multipart/form-data"})
	public DemoData sendLeaveRequest(
			@RequestPart(value="request", required = true) String Data,
			@RequestPart(value = "file", required = false) List<MultipartFile> files) throws JsonMappingException, JsonProcessingException{
		DemoData demoData=objectMapper.readValue(Data , DemoData.class);
//		demoData.toString();
		System.out.println("..............................."+demoData.getFileName()+"...........................");
		return demoDataRepository.save(demoData);
	}
	
}
