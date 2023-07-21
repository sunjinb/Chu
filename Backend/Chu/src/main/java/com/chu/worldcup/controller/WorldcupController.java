package com.chu.worldcup.controller;

import com.chu.global.domain.ImageWithHairInfoDto;
import com.chu.global.domain.ResponseDto;
import com.chu.worldcup.domain.WorldcupRequestDto;
import com.chu.worldcup.service.WorldcupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/worldcup")
public class WorldcupController {

    private final WorldcupService worldcupService;

    @GetMapping("/")
    public ResponseEntity<ResponseDto> getWorldcup(@RequestParam int worldcupSeq){

        ArrayList<ImageWithHairInfoDto> imageWithHairInfoDtoList = worldcupService.getWorldcup(worldcupSeq);

        if(imageWithHairInfoDtoList.size() != 0){
            ResponseDto responseDto = new ResponseDto(200, imageWithHairInfoDtoList);
            return ResponseEntity.ok(responseDto);
        }
        else{
            ResponseDto responseDto = new ResponseDto(204, null);
            return ResponseEntity.ok(responseDto);
        }

    }

    @PostMapping("/")
    public ResponseEntity<ResponseDto> createWorldcup(@RequestBody WorldcupRequestDto worldcupRequestDto) {

        int responseSeq = worldcupService.createWorldcup(worldcupRequestDto);

        // 예외 처리 다시 보기
        if(responseSeq > 0){
            ResponseDto responseDto = new ResponseDto(200, responseSeq);
            return ResponseEntity.ok(responseDto);
        }
        else{
            ResponseDto responseDto = new ResponseDto(204, null);
            return ResponseEntity.ok(responseDto);
        }
    }

}
