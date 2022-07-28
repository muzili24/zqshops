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
public class SysMenu {

    private String id;
    private String menuname;
    private String pic;
    private String flag;
    private String uri;

    private String furi;
    private String em1;
    private String em2;
    private String em3;
    private String em4;

    private String stat;
    private String createname;
    private String createtimes;
    private String updatename;
    private String updatetimes;

}
