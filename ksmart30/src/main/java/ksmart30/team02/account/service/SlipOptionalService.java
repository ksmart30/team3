package ksmart30.team02.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team02.account.domain.SlipOptionalDomain;
import ksmart30.team02.account.mapper.SlipOptionalMapper;

@Service
@Transactional
public class SlipOptionalService {
@Autowired
SlipOptionalMapper slipOptionalMapper;
public List<SlipOptionalDomain> conditionalSlipSearchView(){
	List<SlipOptionalDomain> slipOptional = slipOptionalMapper.conditionalSlipSearchView();
	return slipOptional;
}

}
