package ksmart30.team00.system.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.system.domain.UserId;
import ksmart30.team00.system.mapper.UserIdMapper;

@Service
public class UserIdService {
    @Autowired UserIdMapper userIdMapper;
    @Autowired UserId resultUserId;

    // 11.1.1 User-ID 등록처리(수정 포함)
    public UserId addUserId(HttpSession httpSession, UserId userId) {
        System.out.println("(S) 11.1.1 User-ID 등록처리 addUserId()");
        UserId resultUserId = new UserId();
        // 확인
        System.out.println(userId.getPASS_WD());
        System.out.println(userId.getPASS_WD_CHECK());
        // 1. 리턴값을 위한 변수생성 및 초기화
        int result = 0;
        // 2. 비밀번호와 비밀번호확인이 일치하는지 확인
           // 2.1 비밀번호가 서로 일치하지 않는 경우
            if(!userId.getPASS_WD().equals(userId.getPASS_WD_CHECK())){
                System.out.println("입력 비밀번호 일치하지 않음");
                // 2.1.1 리턴값 Domain을 이용, 세팅
                userId.setRESULT(Integer.toString(result));
                // 2.1.2 초기화된 리턴값을 리턴변수에 대입
                resultUserId = userId;

            // 2.2 비밀번호가 서로 일치하는 경우
            }else{
                System.out.println("입력 비밀번호 일치함");
                // 2.2.1 User-Id 조회 (등록여부)
                resultUserId = userIdMapper.getUserId(userId);

                    // 2.2.1.1 등록이 이미 되어있는경우 (수정)            
                    if(resultUserId != null) {

                        // 2.2.1.1.1 UserId 수정처리를 위한 Domain세팅 (수정자)
                        userId.setUPD_MAN((String)httpSession.getAttribute("EMP_NO"));
                        // 2.2.1.1.2 UserId 수정처리
                        result = userIdMapper.modifyUserId(userId);
                        System.out.println("UserId 수정처리 쿼리 결과 (1:성공/0:실패) :" + result);
                        // 2.2.1.1.3 수정처리 팝업알림을 위한 리턴값 변경
                        result = 1;
                        // 2.2.1.1.4. 입력 또는 수정된 UserId리스트를 다시 호출
                        resultUserId = userIdMapper.getUserId(userId);
                        // 2.2.1.1.5 리턴값 Domain을 이용, 세팅
                        resultUserId.setRESULT(Integer.toString(result));

                    // 2.2.1.2 등록이 되어 있지 않은 경우 (등록)   
                    }else{

                        // 2.2.1.2.1 UserId 등록처리를 위한 Domain세팅
                        userId.setCRT_MAN((String)httpSession.getAttribute("EMP_NO"));
                        // 2.2.1.2.2 UserId 등록처리
                        result = userIdMapper.addUserId(userId);
                        System.out.println("UserId 등록처리 쿼리 결과 (1:성공/0:실패) :" + result);
                        // 2.2.1.2.3 사용자권한 등록처리 (일반사원 기준)
                        result = userIdMapper.addUserIdLevel(userId);
                        System.out.println("사용자권한 등록처리 쿼리 결과 (1:성공/0:실패) :" + result);
                        // 2.2.1.2.4 등록처리 팝업알림을 위한 리턴값 변경
                        result = 2;
                        // 2.2.1.1.5. 입력 또는 수정된 UserId리스트를 다시 호출
                        resultUserId = userIdMapper.getUserId(userId);
                        // 2.2.1.1.6 리턴값 Domain을 이용, 세팅
                        resultUserId.setRESULT(Integer.toString(result));
                    }     
            }   
        // 3. 결과값 리턴
        return resultUserId;
    }

    // 11.1.2 User-ID 조회
    public UserId getUserId(UserId userId){
        System.out.println("(S) 11.1.2 User-ID 조회 getUserId()");
        // 1. Mapper호출(결과값 : 사원 UserId정보)
        resultUserId = userIdMapper.getUserId(userId);
        // 2. 리턴
        return resultUserId;
    }
}
