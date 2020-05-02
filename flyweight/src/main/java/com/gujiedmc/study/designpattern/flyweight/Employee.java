package com.gujiedmc.study.designpattern.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户信息
 *
 * @author gujiedmc
 * @date 2020/4/21
 */
@AllArgsConstructor
@Data
public class Employee {

    /**
     * 原名姓名。内部状态
     */
    private String name;

    /**
     * 员工所在房间
     */
    private final AbstractRoom room;
}
