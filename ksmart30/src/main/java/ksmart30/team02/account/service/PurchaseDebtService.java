package ksmart30.team02.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team02.account.mapper.PurchaseDebtMapper;
import ksmart30.team00.baseinfo.domain.PurchaseDebt;
@Service
@Transactional
public class PurchaseDebtService {
	@Autowired
	private PurchaseDebtMapper purchaseDebtMapper;
	
	public List<PurchaseDebt> purchaseDebtView(){
		List<PurchaseDebt> purchaseDebt = purchaseDebtMapper.purchaseDebtView();
		
		return purchaseDebt;	
	}
}
