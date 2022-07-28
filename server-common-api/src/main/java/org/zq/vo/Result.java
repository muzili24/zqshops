package org.zq.vo;

import cn.hutool.db.Page;
import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

@Data
public class Result<T> {
    private int code;
    private String msg;
    private List<T> data;
    private PageInfo pager;

}
