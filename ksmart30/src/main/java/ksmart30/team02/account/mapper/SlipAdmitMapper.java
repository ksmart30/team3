package ksmart30.team02.account.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.SlipAdmit;
@Mapper
public interface SlipAdmitMapper {
	//전표헤더
	List<SlipAdmit> slipAdmitList(SlipAdmit slipAdmit);
	//전표상세
	List<SlipAdmit> slipAdmitList2(SlipAdmit slipAdmit);
	//계정과목리스트
	List<Map<String, String>> getAccountCodeList(String account);
	
}
