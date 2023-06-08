package org.zerock.bj2.mappers;

import java.util.List;

import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.TodoDTO;

public interface TodoMapper {
    
    int insert(TodoDTO todoDTO);

    List<TodoDTO> list(PageRequestDTO pageRequestDTO);
    
    // List<TodoDTO> list(@Param("page") int page, int count); mybatis 여러개의 파라미터를 날리기위해

    // 전체카운트 목록 불러오는 작업보다 더 오래걸림
    long listCount(PageRequestDTO pageRequestDTO);


}
