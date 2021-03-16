package org.ict.mapper;

import java.util.List;

import org.ict.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	BoardMapper mapper;
	
	@Test
	public void testGetList() {
		
		List<BoardVO> list = mapper.getList();
		
		list.forEach(a -> {
			log.info(a);
		});
		
	}
	
//	@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		
		board.setTitle("다섯번째 제목");
		board.setContent("다섯번째 내용");
		board.setWriter("김윤흠");
		
		mapper.insert(board);
	}
	
//	@Test
	public void testRead() {
		mapper.read(4L);
	}
	
//	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setBno(1L);
		
		mapper.update(board);
	}
	
//	@Test
	public void testDelete() {
		mapper.delete(4L);
	}

}
