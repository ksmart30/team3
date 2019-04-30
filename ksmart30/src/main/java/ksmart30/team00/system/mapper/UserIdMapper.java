package ksmart30.team00.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.system.domain.UserId;

@Mapper
public interface UserIdMapper {

    // 11.1.1 UserId 등록 조회
    UserId getUserId(UserId userId);

    // 11.1.2 UserId 등록처리
    int addUserId(UserId userId);

    // 11.1.3 UserId 등록수정
    int modifyUserId(UserId userId);

    // 11.1.4 사용자권한 조회
    int getUserIdLevel(UserId userId);

    // 11.1.5 사용자권한 등록(일반사원기준)
    int addUserIdLevel(UserId userId);

}
