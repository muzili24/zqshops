package com.zqpc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.zq.entity.SysDoc;

import java.util.List;

@Mapper
public interface SysDocDAO {

    List<SysDoc> getEmpList(SysDoc s);

}
