package com.zqpc.controller;

import com.zqpc.service.SysDocService;
import com.zqpc.service.TableUserFlagService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zq.entity.SysDoc;
import org.zq.entity.TableUserFlag;
import org.zq.vo.Result;

import javax.annotation.Resource;


@RestController
@Log4j2
public class TableUserFlagController {

    @Resource
    private TableUserFlagService mTableUserFlagService;

    @ResponseBody
    @GetMapping("/tableuserflag")
    public Result getEmpList2(TableUserFlag mTableUserFlag, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        Result<TableUserFlag> list = mTableUserFlagService.getTableUserFlagList(mTableUserFlag, page, limit);
        return list;
    }

}
