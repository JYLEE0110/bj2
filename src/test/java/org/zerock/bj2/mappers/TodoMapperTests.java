package org.zerock.bj2.mappers;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.TodoDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TodoMapperTests {
    
    // 컴파일할때 체크를 하지 않는다.
    @Autowired(required = false)
    private TodoMapper todoMapper;


    @Test
    public void testList(){
        
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().build();

        List<TodoDTO> list = todoMapper.list(pageRequestDTO);

        list.forEach(todo -> log.info(todo));
    }

    @Test
    public void testListCount(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().build();

        long totalCount = todoMapper.listCount(pageRequestDTO);
        log.info("=================");
        log.info("=================");
        log.info(totalCount);
        log.info("=================");
        log.info("=================");
    }

    @Transactional
    @Commit // 기본적으로 rollback하기때문에
    @Test
    public void testInsert(){

        Assertions.assertNotNull(todoMapper,"Todo mapper");

        TodoDTO todoDTO = TodoDTO.builder()
        .title("테스트투두")
        .content("Test")
        .writer("user11")
        .dueDate("2023-06-07")
        .build();

        // int count =  todoMapper.insert(todoDTO); // => 결과값은 1 OR 0

        // Assertions.assertEquals(count,1);


        log.info("================");
        log.info(todoDTO.getTno());
        log.info("================");
    }

}
