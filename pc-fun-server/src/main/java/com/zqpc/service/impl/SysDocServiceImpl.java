package com.zqpc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zqpc.dao.SysDocDAO;
import com.zqpc.service.SysDocService;
import org.springframework.stereotype.Service;
import org.zq.entity.SysDoc;
import org.zq.vo.Result;
import org.zq.vo.StatusCode;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysDocServiceImpl implements SysDocService {

    @Resource
    private SysDocDAO dao;

    @Override
    public Result<SysDoc> getEmpList2(SysDoc s, int page, int limit) {
        PageHelper.startPage(page, limit);
        List<SysDoc> listtxList = dao.getEmpList(s);
        PageInfo<SysDoc> pageInfo = new PageInfo(listtxList);
        Result<SysDoc> r = new Result<>();
        r.setCode(StatusCode.OK);
        r.setMsg(StatusCode.MSGOK);
        r.setPager(pageInfo);
        return r;
    }

}
