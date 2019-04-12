package ksmart30.team02.account.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.UnpaidDomain;
@Mapper
public interface UnpaidMapper {
	public List<UnpaidDomain> getUnpaidContentsList(String SLIP_DATE);
	
	List<Map<String, String>> getAccountCodeList(String account);
}
