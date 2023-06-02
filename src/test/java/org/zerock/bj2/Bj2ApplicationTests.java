package org.zerock.bj2;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.bj2.mappers.TimeMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Bj2ApplicationTests {

	@Autowired
	DataSource dataScource;

	@Autowired
	TimeMapper timeMapper;

	@Test
	void contextLoads() {
		log.info("context Loag...");
	}

	@Test
	public void testConnection(){
		try (Connection con = dataScource.getConnection() ){
			log.info(con);
			log.info("씨발");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 

	@Test
	public void testTime(){
		log.info(timeMapper.getTime());
	}
}
