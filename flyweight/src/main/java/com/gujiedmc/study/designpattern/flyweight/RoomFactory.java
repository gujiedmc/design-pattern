package com.gujiedmc.study.designpattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 部门共享池
 *
 * @author gujiedmc
 * @date 2020/4/21
 */
public class RoomFactory {

	/**
	 * 办公室房间共享池
	 */
	private static final Map<Integer, AbstractRoom> DEPARTMENT_POOL = new ConcurrentHashMap<>(8);

	/**
	 * 查找部门，如果不存在则创建。
	 */
	public static AbstractRoom get(final int roomNo) {
		return DEPARTMENT_POOL.computeIfAbsent(roomNo, key -> new StandardRoom(roomNo));
	}
}
