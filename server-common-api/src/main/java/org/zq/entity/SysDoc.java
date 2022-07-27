package org.zq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 系统字典表
 * 史忠吉
 * 2022年7月27日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysDoc extends Pager{

    private String id;
    private String docnum;
    private String keys;
    private String values;
    private String region;
    private String stat;
    private String flag;
    private String createname;
    private String createtimes;
    private String updatename;
    private String updatetimes;



}
