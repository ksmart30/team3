package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.BusinessCard;

@Mapper
public interface BusinessCardMapper {
	//기업카드 등록 리스트
	List<BusinessCard> businessCardList();
}
