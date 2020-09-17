package com.payn.cache.ehcache.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: payn
 * @date: 2020/9/17 22:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = -3642616268593932849L;
	
	/**
	 * 主键id
	 */
	private Long id;
	/**
	 * 姓名
	 */
	private String name;
}
