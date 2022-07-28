package com.zqpc.service;

import org.zq.entity.SysDoc;
import org.zq.vo.Result;

public interface SysDocService {

    Result<SysDoc> getEmpList2(SysDoc s, int page, int limit);

}
