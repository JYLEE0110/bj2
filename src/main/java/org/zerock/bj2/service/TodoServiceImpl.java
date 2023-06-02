package org.zerock.bj2.service;

import org.springframework.stereotype.Service;
import org.zerock.bj2.mappers.TimeMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Service
@RequiredArgsConstructor
@Log4j2
public class TodoServiceImpl implements TodoService {

    private final TimeMapper timeMapper;
    
}
