package com.zqpc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zqpc.dao.SysDocDAO;
import com.zqpc.dao.TableUsersFlagDAO;
import com.zqpc.service.TableUserFlagService;
import org.springframework.stereotype.Service;
import org.zq.entity.SysDoc;
import org.zq.entity.TableUserFlag;
import org.zq.vo.Result;
import org.zq.vo.StatusCode;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TableUserFlagServiceImpl implements TableUserFlagService {

    @Resource
    private TableUsersFlagDAO mTableUsersFlagDAO;

    @Override
    public Result<TableUserFlag> getTableUserFlagList(TableUserFlag mTableUserFlag, int page, int limit) {
        PageHelper.startPage(page, limit);
        List<TableUserFlag> listtxList = mTableUsersFlagDAO.getTableUserFlagList(mTableUserFlag);
        PageInfo<TableUserFlag> pageInfo = new PageInfo(listtxList);
        Result<TableUserFlag> r = new Result<>();
        r.setCode(StatusCode.OK);
        r.setMsg(StatusCode.MSGOK);
        r.setPager(pageInfo);
        return r;
    }

}
