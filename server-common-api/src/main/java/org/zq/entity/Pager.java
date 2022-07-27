package org.zq.entity;

import lombok.Data;


/***
 * 分页公用方法
 * @Aurture 史忠吉
 * 2022年7月27日
 */

@Data
public class Pager {
	protected Integer start;
	protected Integer offset;
	protected String sort;
	protected String order;
}
