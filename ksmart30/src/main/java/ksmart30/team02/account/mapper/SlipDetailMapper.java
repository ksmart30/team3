package ksmart30.team02.account.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SlipDetailMapper {
	List<Map<String, String>> getAccountCodeList(String account);
	
	List<Map<String, String>> getDeptCodeList(String dept);
	
	List<Map<String, String>> getCustCodeList(String cust);
	
	List<Map<String, Object>> getSlipList(HashMap<String,Object> searchMap);
}
