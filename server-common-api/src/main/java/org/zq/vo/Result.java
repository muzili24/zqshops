package org.zq.vo;

import lombok.Data;

import java.util.List;

@Data
public class Result<T> {
    private int code;
    private String msg;
    private long count;
    private List<T> data;

}
