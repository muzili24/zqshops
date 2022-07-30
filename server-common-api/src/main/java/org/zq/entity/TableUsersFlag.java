package org.zq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 用户权限表
 * 李
 * 2022年7月30日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableUserFlag {
    private String id;
    private String flagname;
    private Float em1;
    private Float em2;
    private Integer shopnum;
    private Float weight;
    private String userid;
    private String subordinate1;
    private String subordinate2;
}
