package com.reckey.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class CompanyDTO {

	@Getter
	@Setter
	@NoArgsConstructor
	public static class Info{
		private String imageUrl;
		private String name;
		private String id;
	}
	
	@Getter
	@Setter
	public static class Request{
		private String sortType;
		private String offset;
	}
	
	@Getter
	@Setter
	public static class Response{
		private int size = 0;
		private List<Info> items;
	}
}
