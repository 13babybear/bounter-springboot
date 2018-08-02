package com.bounter.springboot.controller;

import com.bounter.springboot.common.ResponseData;
import com.bounter.springboot.service.BounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/bounter")
public class BounterController {
	
	@Autowired
	private BounterService bounterService;


	@GetMapping("/{id}")
	public ResponseData<?> get(@PathVariable Long id) {
		return new ResponseData<>().success().data(bounterService.findById(id));
	}
	
}
