package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.PurchaseDebt;

@Mapper
public interface PurchaseDebtMapper {
	List<PurchaseDebt> purchaseDebtView();
}
