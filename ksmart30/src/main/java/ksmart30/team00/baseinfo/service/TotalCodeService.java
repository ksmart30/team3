package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team00.baseinfo.mapper.TotalCodeMapper;
import ksmart30.team00.baseinfo.domain.TotalCode;

@Service
@Transactional
public class TotalCodeService {
	@Autowired private TotalCodeMapper totalCodeMapper;
	
	public List<TotalCode> totalCodeTreeSearch(){
		List<TotalCode> list = totalCodeMapper.totalCodeTreeSelect();
		
		for(int i=0; i<list.size(); i++) {
			
			switch(list.get(i).getBUSI_GB()) { 
				// 회계관리
				case "A" : 
					list.get(i).setId(list.get(i).getLEVEL1_CD());
					list.get(i).setPid("3");
					list.get(i).setName(list.get(i).getLEVEL1_NM());
					break; 
				
				// 경영정보
				case "E" :
					list.get(i).setId(list.get(i).getLEVEL1_CD());
					list.get(i).setPid("5");
					list.get(i).setName(list.get(i).getLEVEL1_NM());
					break;
				
				// 인력관리
				case "H" :
					list.get(i).setId(list.get(i).getLEVEL1_CD());
					list.get(i).setPid("4");
					list.get(i).setName(list.get(i).getLEVEL1_NM());
					break;
				
				// 사업성검토/MH/계약프로젝트
				case "J" :
					list.get(i).setId(list.get(i).getLEVEL1_CD());
					list.get(i).setPid("1");
					list.get(i).setName(list.get(i).getLEVEL1_NM());
					break;
					
				// 설계정보
				case "P" : 
					list.get(i).setId(list.get(i).getLEVEL1_CD());
					list.get(i).setPid("2");
					list.get(i).setName(list.get(i).getLEVEL1_NM());
					break;
				
				// 시스템관리
				case "S" :
					list.get(i).setId(list.get(i).getLEVEL1_CD());
					list.get(i).setPid("6");
					list.get(i).setName(list.get(i).getLEVEL1_NM());
					break;		
			}
		}
		return list;
	}
	
	public List<TotalCode> totalCodeClassifySearch(String LEVEL1_NM){
		if(LEVEL1_NM.equals("사업성검토/MH계약프로젝트")||LEVEL1_NM.equals("설계정보")||LEVEL1_NM.equals("회계관리")||LEVEL1_NM.equals("인력관리")||LEVEL1_NM.equals("경영정보")||LEVEL1_NM.equals("시스템관리")) {
			return null;
		}else {
			
			List<TotalCode> list = totalCodeMapper.totalCodeClassifySelect(LEVEL1_NM);
			
			for(int i=0; i<list.size(); i++) {				
				switch(list.get(i).getBUSI_GB()) { 
					// 회계관리
					case "A" : 
						list.get(i).setBUSI_NM("회계관리");
						break; 
					
					// 경영정보
					case "E" :
						list.get(i).setBUSI_NM("경영정보");
						break;
					
					// 인력관리
					case "H" :
						list.get(i).setBUSI_NM("인력관리");
						break;
					
					// 사업성검토/MH/계약프로젝트
					case "J" :
						list.get(i).setBUSI_NM("사업성검토/MH계약프로젝트");
						break;
						
					// 설계정보
					case "P" : 
						list.get(i).setBUSI_NM("설계정보");
						break;
					
					// 시스템관리
					case "S" :
						list.get(i).setBUSI_NM("시스템관리");
						break;		
				}
			}
			System.out.println(list.get(0).getBUSI_NM()+"<--구분값");
			return list;
		}

	}
}
