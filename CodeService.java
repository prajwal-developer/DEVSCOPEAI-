package com.kodnest.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.project.Entity.Code;
import com.kodnest.project.Repository.CodeRepository;
import com.kodnest.project.dto.CodeRequest;
import com.kodnest.project.dto.CodeResponse;

@Service
public class CodeService {
	
	private final String API_KEY = "openai_api_key_dev03";
	
	@Autowired
	private OpenAIService openAIService;
	
	@Autowired
	private CodeRepository codeRepository;
	
	public CodeResponse analyzeCode(CodeRequest request)
	{
		CodeResponse response = openAIService.getAnalysis(request);
		
		Code code = new Code();
		
		code.setUsername(request.getUsername());
		code.setLanguage(request.getLanguage());
		code.setCode(request.getCode());
		code.setAiScore(response.getAiScore());
		code.setFeedback(response.getFeedback());
		code.setSuggestions(response.getSuggestions());
		
		codeRepository.save(code);
		
		return response;
		
	}

}
