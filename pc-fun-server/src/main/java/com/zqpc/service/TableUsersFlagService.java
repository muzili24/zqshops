package com.zqpc.service;

import org.zq.entity.TableUserFlag;
import org.zq.vo.Result;

public interface TableUserFlagService {
    Result<TableUserFlag> getTableUserFlagList(TableUserFlag mTableUserFlag, int page, int limit);
}
