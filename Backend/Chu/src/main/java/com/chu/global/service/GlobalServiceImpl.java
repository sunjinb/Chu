package com.chu.global.service;

import com.chu.global.domain.SignInDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GlobalServiceImpl implements GlobalService {

    @Override
    public boolean signIn(SignInDto signDto) {

    }
}
