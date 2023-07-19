package com.chu.designer.repository;

import com.chu.designer.domain.DesignerSearchDto;
import com.chu.designer.domain.DesignerSearchResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Slf4j
@Repository
public class DesignerSearchRepositoryImpl implements DesignerSearchRepository {

    @Override
    public ArrayList<DesignerSearchDto> search2Name(int customerSeq, String name) {
        ArrayList<DesignerSearchDto> list = new ArrayList<>();
        //필요 데이터 추출
        // 디자이너

        // 좋아요 수

        // 고객이 좋아하는지

        // 이름 조건 걸어서 검색
        return list;
    }
}
