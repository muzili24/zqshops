package org.zq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/***
 * 用户信息表
 * 李
 * 2022年7月30日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableUser {
    private String id;
    private String appid;
    private String tel;
    private String pic;
    private String cardid;
    private String sex;
    private String age;
    private String address;
    private String email;
    private String proint;
    private String city;
    private String picone;
    private String pictwo;
    private String homenum;
    private String homeid;
    private String stat;
    private Date createtimes;
    private String pid;
    private String flagid;
    private String pgback;
}
