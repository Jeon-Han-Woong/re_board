package org.ict.domain;

import lombok.Data;

@Data
public class BoardVO {
	
	private Long bno;
	private String content;
	private String title;
	private String writer;
	private String regdate;
	private String updatedate;
	
}
