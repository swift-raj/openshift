package com.nasco.demo.members.memebersdemo;

public class APIData {

	private final long id;
	private final String content;

	public APIData(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
