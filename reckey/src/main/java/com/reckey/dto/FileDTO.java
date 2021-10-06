package com.reckey.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class FileDTO {

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Info{
		private String fileName;
	}
}
