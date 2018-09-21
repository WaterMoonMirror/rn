package com.tkn.rn.vo;

import lombok.Data;

@Data
public class ResultVo<T> {
    private String code;
    private String msg;
    private T data;

}
