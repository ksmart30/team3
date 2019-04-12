package ksmart30.team02.account.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team02.account.domain.UnpaidDomain;
import ksmart30.team02.account.mapper.UnpaidMapper;

@Service
@Transactional
public class UnpaidService {
	@Autowired
	UnpaidMapper unpaidMapper;
	public List<UnpaidDomain> getUnpaidContentsList(String SLIP_DATE){
		List<UnpaidDomain> unpaidlist = unpaidMapper.getUnpaidContentsList(SLIP_DATE);
		System.out.println(unpaidlist.toString());
		return unpaidlist;
	}
	public List<Map<String,String>> getAccountCode(String account){
		List<Map<String,String>> list = unpaidMapper.getAccountCodeList(account);
		System.out.println(list.toString());
		return list;
	}
}
