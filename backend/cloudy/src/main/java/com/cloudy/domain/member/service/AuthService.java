package com.cloudy.domain.member.service;

import com.cloudy.domain.member.model.dto.request.MemberNormalCreateRequest;
import com.cloudy.domain.member.model.dto.request.MemberLoginRequest;
import com.cloudy.domain.member.model.dto.request.MemberReissueRequest;
import com.cloudy.domain.member.model.dto.response.MemberLoginResponse;
import com.cloudy.domain.member.model.dto.response.MemberReissueTokenResponse;

public interface AuthService {

    void normalRegister(MemberNormalCreateRequest request);  // 회원가입 메서드

    boolean checkDuplicatedId(String loginId);  // 아이디 중복 확인 메서드

    MemberLoginResponse login(MemberLoginRequest request);  // 로그인 메서드

    MemberReissueTokenResponse reissueToken(MemberReissueRequest memberReissueRequest);

}
