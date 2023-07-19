package com.chu.customer.service;

import com.chu.customer.domain.CustomerDetailDto;
import com.chu.customer.domain.CustomerDto;
import com.chu.customer.domain.CustomerSignUpDto;
import com.chu.global.domain.ChangePwdDto;
import com.chu.global.domain.FindIdDto;
import com.chu.global.domain.FindPwdDto;
import com.chu.global.domain.SignInDto;

public interface CustomerService {

    boolean checkId(String id);
    boolean checkEmail(String email);
    int signUp(CustomerSignUpDto customerSignUpDto);

    boolean signIn(SignInDto signInDto);

    CustomerDetailDto getCustomerDetail(String id);

    String findId(FindIdDto findIdDto);

    int isValidUser(FindPwdDto findPwdDto);

    boolean changePwd(ChangePwdDto changePwdDto);
}
