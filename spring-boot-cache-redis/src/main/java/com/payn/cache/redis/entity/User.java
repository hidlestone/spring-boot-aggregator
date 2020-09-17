package com.payn.cache.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户
 *
 * @author: payn
 * @date: 2020/9/17 8:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = 6110297575961993188L;

	/**
	 * 主键id
	 */
	private Long id;
	/**
	 * 姓名
	 */
	private String name;
}
