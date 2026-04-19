package com.kodnest.project.dto;

import java.util.Objects;

public class CodeRequest {
	
	private String username;
	
	private String code;
	
	private String language;

	public CodeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CodeRequest(String username, String code, String language) {
		super();
		this.username = username;
		this.code = code;
		this.language = language;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "CodeRequest [username=" + username + ", code=" + code + ", language=" + language + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, language, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeRequest other = (CodeRequest) obj;
		return Objects.equals(code, other.code) && Objects.equals(language, other.language)
				&& Objects.equals(username, other.username);
	}
	
	

}
