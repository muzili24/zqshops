package org.zq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 系统功能表
 * 史忠吉
 * 2022年7月27日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysFunction {

    private String id;
    private String funname;
    private String uri;
    private String stat;
    private String createname;
    private String createtimes;
    private String updatename;
    private String updatetimes;

}
