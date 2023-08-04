package com.ssafy.lions.domain.navigation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Schema(description = "거쳐야할 지점 정보를 담은 객체")
public class PointDto {
    @Schema(description = "지점의 ID", example = "312, 313")
    int pointId;
    @Schema(description = "지점의 이름", example = "'1-2블럭', '5층 2번 게이트 근처 계단'")
    String pointName;
    @Schema(description = "지점의 타입", example = "G : 게이트(기둥), S : 계단, E : 출구")
    char type; // G : 기둥, S : 계단, E : 출구

    @Builder
    public PointDto(int pointId, String pointName, char type){
        this.pointId = pointId;
        this.pointName = pointName;
        this.type = type;
    }
}
