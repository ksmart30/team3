package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.SlipOptionalDomain;

@Mapper
public interface SlipOptionalMapper {
	List<SlipOptionalDomain> conditionalSlipSearchView();
}
