package com.reckey.dto;

import java.util.List;

import io.swagger.annotations.ApiParam;
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
	public static class RequestList{
		@ApiParam
		private String sortType;
		
		@ApiParam(required = true)
		private int offset;
		
		@ApiParam(required = true)
		private int page;
	}
	
	@Getter
	@Setter
	public static class Response{
		private int size = 0;
		private List<Info> items;
	}
}
