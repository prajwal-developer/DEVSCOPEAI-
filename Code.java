package com.kodnest.project.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Code {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String language;
	
	@Column(columnDefinition = "text")
	private String code;
	
	private int aiScore;
	
	@Column(columnDefinition = "text")
	private String feedback;
	
	private String suggestions;

	public Code() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Code(Long id, String username, String language, String code, int aiScore, String feedback,
			String suggestions) {
		super();
		this.id = id;
		this.username = username;
		this.language = language;
		this.code = code;
		this.aiScore = aiScore;
		this.feedback = feedback;
		this.suggestions = suggestions;
	}

	public Code(String username, String language, String code, int aiScore, String feedback, String suggestions) {
		super();
		this.username = username;
		this.language = language;
		this.code = code;
		this.aiScore = aiScore;
		this.feedback = feedback;
		this.suggestions = suggestions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	@Override
	public String toString() {
		return "Code [id=" + id + ", username=" + username + ", language=" + language + ", code=" + code + ", aiScore="
				+ aiScore + ", feedback=" + feedback + ", suggestions=" + suggestions + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aiScore, code, feedback, id, language, suggestions, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return aiScore == other.aiScore && Objects.equals(code, other.code) && Objects.equals(feedback, other.feedback)
				&& Objects.equals(id, other.id) && Objects.equals(language, other.language)
				&& Objects.equals(suggestions, other.suggestions) && Objects.equals(username, other.username);
	}
	
	

}
