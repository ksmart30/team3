package ksmart30.team03.mh.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team03.mh.domain.ResultCost;
import ksmart30.team03.mh.domain.ResultList;
import ksmart30.team03.mh.mapper.ResultGraphMapper;

@Service
public class ResultGraphService {
		@Autowired private ResultGraphMapper resultGraphMapper;
		
	//5.2.1 M/H계획 실적 그래프 리스트 출력
	public List<ResultList> getResultGraphList() {
		System.out.println("SERVICE : M/H계획 실적 그래프 리스트 출력");
		return resultGraphMapper.getResultGraphList();
	}
	//5.2.1 M/H계획 실적 그래프 리스트 출력(날짜검색추가)
		public List<ResultList> getResultGraphListDate(String CONTRACT_PRI1, String CONTRACT_PRI2) {
			System.out.println("SERVICE : M/H계획 실적 그래프 리스트 출력");
			List<ResultList> data2 = resultGraphMapper.getResultGraphList();
	//crt_date, end_date 중에 하나라도 없으면 전체 리스트를 출력
			if(CONTRACT_PRI1 == "" && CONTRACT_PRI2 == "" || 
			   CONTRACT_PRI1 !="" && CONTRACT_PRI2 == "" ||
			   CONTRACT_PRI1 =="" && CONTRACT_PRI2 != "") {
				System.out.println("시작,종료날짜 null인경우 출력!");
				data2 = resultGraphMapper.getResultGraphList();	
			}else {
				data2 = resultGraphMapper.getResultGraphListDate(CONTRACT_PRI1, CONTRACT_PRI2);	
			}			
			return data2;
	}		
	/* //5.2.1M/H 계획 그래프 차트에 입력될 값 출력
	public List<ResultList> getResultGraph(String pjt_cd) {
		System.out.println("SERVICE : M/H계획 실적 그래프 값 출력");
		return resultGraphMapper.getResultGraph(pjt_cd);
	}
	//5.2.1 M/H 계획 그래프 차트에 입력될 값 출력
		public List<ResultList> getResultGraph2(String pjt_cd) {
			System.out.println("SERVICE : M/H계획 실적 그래프 값 출력");
			return resultGraphMapper.getResultGraph2(pjt_cd);
	}

	
	//5.2.1 M/H 인건비 그래프 차트에 입력될 값 출력(계획)
	public List<ResultCost> getResultGraphPlanNugae(String pjt_cd) {
		System.out.println("SERVICE : M/H계획실적 인건비 계획 그래프 값 출력"); 
		return resultGraphMapper.getResultGraphPlanNugae(pjt_cd); 
	}
	//5.2.1 M/H 인건비 그래프 차트에 입력될 값 출력(실적)
	public List<ResultCost> getResultGraphResultNugae(String pjt_cd) {
		System.out.println("SERVICE : M/H계획실적 인건비 실적 그래프 값 출력"); 
		return resultGraphMapper.getResultGraphResultNugae(pjt_cd); 
	}
 */

	public Map<String, Object> getResultGraph(String pjt_cd) {
		System.out.println("Service getProjectManageHyunhwangCount 메서드 실행");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("PJT_CD", pjt_cd);
		// 결과 리턴용 Map
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("planHrGraph", resultGraphMapper.getResultGraph(map));
		resultMap.put("nugaeHrGraph", resultGraphMapper.getResultGraph2(map));
		resultMap.put("planEmployeeGraph", resultGraphMapper.getResultGraphPlanNugae(map));
		resultMap.put("nugaeEmployeeGraph", resultGraphMapper.getResultGraphResultNugae(map));
		return resultMap;
	}

}
