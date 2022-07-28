package com.zqpc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zqpc.dao.SysDocDAO;
import com.zqpc.service.SysDocService;
import org.springframework.stereotype.Service;
import org.zq.entity.SysDoc;
import org.zq.vo.Result;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysDocServiceImpl implements SysDocService {

    @Resource
    private SysDocDAO dao;

    @Override
    public Result<SysDoc> getEmpList2(SysDoc s, int page, int limit) {
        Page<SysDoc> pages = PageHelper.startPage(page, limit);
        List<SysDoc> listtxList = dao.getEmpList(s);
        Result<SysDoc> txlListData = new Result<>();
        txlListData.setCode(0);
        txlListData.setMsg("");
        txlListData.setCount(pages.getTotal());
        txlListData.setData(listtxList);
        return txlListData;
    }

}
