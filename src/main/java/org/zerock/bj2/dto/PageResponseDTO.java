package org.zerock.bj2.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 회원페이징인지 list페이징인지 모르기 떄문에 <E> generic을 사용해서 재사용성을 높임

@NoArgsConstructor
@Data
public class PageResponseDTO<E> {
    
    // 나중에 결정
    private List<E> list;

    private long total;

    @Builder(builderMethodName  = "withAll")
    public PageResponseDTO(List<E> list, long total){
        this.list = list;
        this.total = total;
    }


}
