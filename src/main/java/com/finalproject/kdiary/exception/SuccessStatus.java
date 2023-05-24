package com.finalproject.kdiary.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessStatus {

    /**
     * 발음 api
     */
    GET_PRONUNCIATION_SUCCESS(HttpStatus.OK, "발음 점수 불러오기 성공"),

    /**
     * diary api
     */
    CREATE_DIARY_SUCCEESS(HttpStatus.CREATED, "다이어리 생성 성공"),
    GET_DIARY_SUCCESS(HttpStatus.OK, "다이어리 불러오기 성공"),
    GET_DIARY_LIST_SUCCESS(HttpStatus.OK, "다이어리 리스트 불러오기 성공"),

    /**
     * user api
     */
    CREATE_USER_SUCCESS(HttpStatus.CREATED, "유저 생성 성공"),
    ;

    private final HttpStatus httpStatus;
    private final String message;
}
