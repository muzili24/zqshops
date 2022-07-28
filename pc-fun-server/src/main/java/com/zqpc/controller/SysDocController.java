package com.zqpc.controller;

import com.zqpc.service.SysDocService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zq.entity.SysDoc;
import org.zq.vo.Result;

import javax.annotation.Resource;


@RestController
@Log4j2
public class SysDocController {

    @Resource
    private SysDocService service;

    @ResponseBody
    @GetMapping("/empsysdoc")
    public Result getEmpList2(SysDoc s, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        Result<SysDoc> list = service.getEmpList2(s, page, limit);
        return list;
    }

}
