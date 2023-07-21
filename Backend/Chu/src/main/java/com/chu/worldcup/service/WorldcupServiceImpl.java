package com.chu.worldcup.service;

import com.chu.global.domain.ImageWithHairInfoDto;
import com.chu.worldcup.domain.WorldcupRequestDto;
import com.chu.worldcup.repository.WorldcupRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
@RequiredArgsConstructor
public class WorldcupServiceImpl implements WorldcupService {

    private final WorldcupRepository worldcupRepository;

    @Override
    public int createWorldcup(WorldcupRequestDto worldcupRequestDto) {
        return worldcupRepository.createWorldcup(worldcupRequestDto);
    }

    @Override
    public ArrayList<ImageWithHairInfoDto> getWorldcup(int worldcupSeq) {
        return worldcupRepository.getWorldcup(worldcupSeq);
    }
}
