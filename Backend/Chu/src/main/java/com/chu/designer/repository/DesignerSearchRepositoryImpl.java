package com.chu.designer.repository;

import com.chu.designer.domain.ResponseDesignerDetailInfoDto;
import com.chu.designer.domain.ResponseDesignerSearchAreaDto;
import com.chu.designer.domain.DesignerSearchDto;
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

        // 이름 조건 걸어서 검색

        // 좋아요 수

        // 고객이 좋아하는지
        return list;
    }

    @Override
    public ArrayList<DesignerSearchDto> search2Filter(int customerSeq, String[] hairStyle) {
        ArrayList<DesignerSearchDto> list = new ArrayList<>();
        //필요 데이터 추출
        // 디자이너

        // 디자이너 스타일 태그로 검색

        // 좋아요 수

        // 고객이 좋아하는지
        return list;
    }

    @Override
    public ArrayList<DesignerSearchDto> search2LikeCount(int customerSeq) {
        ArrayList<DesignerSearchDto> list = new ArrayList<>();
        //필요 데이터 추출
        // 디자이너

        // 좋아요 수

        // 고객이 좋아하는지
        
        // 좋아요 순으로 정렬
        return list;
    }

    @Override
    public ArrayList<DesignerSearchDto> search2ReviewScore(int customerSeq) {
        ArrayList<DesignerSearchDto> list = new ArrayList<>();

        // 고객이 좋아하는지 여부도

        // 디자이너 리뷰순으로 정렬

        return list;
    }

    @Override
    public ArrayList<ResponseDesignerSearchAreaDto> search2AllArea() {
        ArrayList<ResponseDesignerSearchAreaDto> list = new ArrayList<>();
        //필요 데이터 추출
        // 디자이너

        // 지역정보
        return list;
    }

    @Override
    public ResponseDesignerDetailInfoDto getDesignerDetailInfo(int designerSeq, int customerSeq) {
        // 이거도 조인 너무 많으면 함수로 빼서 간단한거 여러개 해도 될듯
        
        ResponseDesignerDetailInfoDto responseDesignerDetailInfoDto = null;

        //    디자이너 정보
        //    좋아요 수
        //    고객이 좋아하는지
        //    포트폴리오 정보들
        //    리뷰들 정보
        return responseDesignerDetailInfoDto;
    }

    @Override
    public ArrayList<DesignerSearchDto> search2Like(int customerSeq) {
        ArrayList<DesignerSearchDto> list = new ArrayList<>();
        //필요 데이터 추출
        // 고객이 좋아하는 디자이너 idx

        // -> 디자이너 정보
        return list;
    }
}
