package com.axuan.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author axuan
 * @version 1.0
 * @date 2022/3/21 17:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultCommon<T> {
    private Integer code;
    private String message;
    private T data;

    public ResultCommon(Integer code, String message) {
        this(code, message, null);
    }
}