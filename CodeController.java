package com.kodnest.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.project.Entity.Code;
import com.kodnest.project.Repository.CodeRepository;
import com.kodnest.project.Service.CodeService;
import com.kodnest.project.dto.CodeRequest;
import com.kodnest.project.dto.CodeResponse;

@RestController
@RequestMapping("/api/code")
@CrossOrigin
public class CodeController {
	
	@Autowired
	private CodeService codeService;
	
	@Autowired
	private CodeRepository codeRepository;
	
	@PostMapping("/analyze")
	public CodeResponse analyze(@RequestBody CodeRequest request)
	{
		return codeService.analyzeCode(request);
	}
	
	@GetMapping("/all")
	public List<Code> getAll()
	{
		return codeRepository.findAll();
	}

}
