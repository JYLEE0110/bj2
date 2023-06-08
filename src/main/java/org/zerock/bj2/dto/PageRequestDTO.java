package org.zerock.bj2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/* 
 *  화면에서 모든 리스트
 */

 @Builder
 @AllArgsConstructor
 @NoArgsConstructor
 @Getter
 @ToString
public class PageRequestDTO {
    
    @Builder.Default // builder를 쓸때 기본적으로 값에 들어가게하기위해서
    private int page = 1;
    
    @Builder.Default // builder를 쓸때 기본적으로 값에 들어가게하기위해서
    private int size = 10;

    // setter의 본 목적
    public void setPage(int page){
        if(page <= 0){
            this.page = 1;
        }
    }

    public void setSize(int size){
        if(size > 100 || size < 0){
            this.size = 10;
        }
    }

    // Mysql은 식이 안들어가서 DTO에서 처리 후 ${skip}, ${end}로 처리
    public int getSkip(){
        return (this.page-1) * this.size;
    }

    public int getEnd(){
        return this.page * this.size;
    }

    public int getCountEnd(){
        
        int temp = (int) (Math.ceil(this.page / 10.0)) *100;

        return temp + 1;
    }
}
