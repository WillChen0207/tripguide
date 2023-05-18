package com.TripGuide.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    //相应码
    private Integer code;
    //信息
    private String msg;
    //返回数据
    private T data;
}
