/* 8.1.전표입력
 * @file      SlipService.java
 * @brief    전표입력 서비스 로직
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team02.account.domain.SlipDetailDomain;
import ksmart30.team02.account.domain.SlipHeaderDomain;
import ksmart30.team02.account.mapper.SlipMapper;

@Service
public class SlipService {
@Autowired
SlipMapper slipMapper;
	//8.1.전표입력
	/* @param  String slip_DATE, String slip_NO 
	 * @brief   SlipMapper객체 내 slipList메서드 호출, slip_DATE 데이터 '-' 제거 	   		 	  
	 * @return  List<Slip> slip
	 */
	public Map<String, Object> slipSearchProcess(SlipDetailDomain slipDetailDomain){
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("02 slipSearchProcess 단위테스트");
		String slip_DATE = slipDetailDomain.getSLIP_DATE();		
		System.out.println("slip_DATE : " + slip_DATE);		
		String slip_DATE1 = slip_DATE.substring(0, 4);
		String slip_DATE2 = slip_DATE.substring(5, 7);
		String slip_DATE3 = slip_DATE.substring(8, 10);
		System.out.println("slip_DATE1 : " + slip_DATE1);
		System.out.println("slip_DATE2 : " + slip_DATE2);
		System.out.println("slip_DATE3 : " + slip_DATE3);
		slip_DATE = slip_DATE1 + slip_DATE2 + slip_DATE3;
		System.out.println("slip_DATE : " + slip_DATE);
		slipDetailDomain.setSLIP_DATE(slip_DATE);
		List<SlipDetailDomain> slip =  slipMapper.getSlipInfo(slipDetailDomain);
		int accAmtD = 0;
		int accAmtC = 0;
		for(int i=0; i<slip.size(); i++) {
			SlipDetailDomain slipDomain2 = slip.get(i);
			System.out.println("slipDomain2 : " + slipDomain2);
				if(slipDomain2.getDRCR_GB().equals("D")) {
					accAmtD += Integer.parseInt(slipDomain2.getACC_AMT());	
					System.out.println("Integer.parseInt(slipDomain2.getACC_AMT()); : " + Integer.parseInt(slipDomain2.getACC_AMT()));
				} else if(slipDomain2.getDRCR_GB().equals("C")) {
					accAmtC += Integer.parseInt(slipDomain2.getACC_AMT());
				}
		}
		System.out.println("accAmtC : " + accAmtC);
		System.out.println("accAmtD : " + accAmtD);
		SlipHeaderDomain slipHeader = slipMapper.getSlipHeaderInfo(slipDetailDomain);
		String slipDate = slipHeader.getSLIP_DATE();
		String slipDate1 = slipDate.substring(0, 4);
		String slipDate2 = slipDate.substring(4, 6);
		String slipDate3 = slipDate.substring(6, 8);
		slipDate = slipDate1 + "-" + slipDate2 + "-" + slipDate3;
		System.out.println("slipDate : " + slipDate);
		slipHeader.setSLIP_DATE(slipDate);
		String initDate = slipHeader.getINIT_DATE();
		String initDate1 = initDate.substring(0, 4);
		String initDate2 = initDate.substring(4, 6);
		String initDate3 = initDate.substring(6, 8);
		initDate = initDate1 + "-" + initDate2 + "-" + initDate3;
		System.out.println("initDate : " + initDate);
		slipHeader.setINIT_DATE(initDate);
		map.put("accAmtD", accAmtD);
		map.put("accAmtC", accAmtC);
		map.put("slip", slip);
		map.put("slipHeader", slipHeader);
		System.out.println("slip : " + slip);
		return map;
	}
	public SlipDetailDomain controlItemSearchProcess(SlipDetailDomain slipDetailDomain){	
		String slip_DATE = slipDetailDomain.getSLIP_DATE();		
		System.out.println("slip_DATE : " + slip_DATE);		
		String slip_DATE1 = slip_DATE.substring(0, 4);
		String slip_DATE2 = slip_DATE.substring(5, 7);
		String slip_DATE3 = slip_DATE.substring(8, 10);
		System.out.println("slip_DATE1 : " + slip_DATE1);
		System.out.println("slip_DATE2 : " + slip_DATE2);
		System.out.println("slip_DATE3 : " + slip_DATE3);
		slip_DATE = slip_DATE1 + slip_DATE2 + slip_DATE3;
		System.out.println("slip_DATE : " + slip_DATE);
		slipDetailDomain.setSLIP_DATE(slip_DATE);
		SlipDetailDomain list = slipMapper.getControlItemInfo(slipDetailDomain);
		System.out.println("list : " + list);
		return list;
	}
	
}
