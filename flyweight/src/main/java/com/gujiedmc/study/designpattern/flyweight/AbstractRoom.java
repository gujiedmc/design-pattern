package com.gujiedmc.study.designpattern.flyweight;

import lombok.Data;

/**
 * 房间
 *
 * @author gujiedmc
 * @date 2020/4/21
 */
@Data
public abstract class AbstractRoom {

	/**
	 * 房间号。内部状态。
	 */
	private Integer roomNo;

	public AbstractRoom(Integer roomNo) {
		this.roomNo = roomNo;
	}

	/**
	 * 生成具体座位位置。输入外部状态 座位号
	 */
	public String generatorSeats(String seatNumber) {

		return "房间号：" + roomNo + "，座位号" + seatNumber;
	}
}
