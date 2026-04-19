package com.kodnest.project.dto;

public class CodeResponse {
	
	private int aiScore;
	
	private String feedback;
	
	private String suggestions;

	public CodeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CodeResponse(int aiScore, String feedback, String suggestions) {
		super();
		this.aiScore = aiScore;
		this.feedback = feedback;
		this.suggestions = suggestions;
	}

	public int getAiScore() {
		return aiScore;
	}

	public void setAiScore(int aiScore) {
		this.aiScore = aiScore;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	
	

}
