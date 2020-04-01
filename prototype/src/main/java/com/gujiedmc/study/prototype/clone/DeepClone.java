package com.gujiedmc.study.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 原型模式
 * 深拷贝
 *
 * @author gujiedmc
 * @date 2020/04/01
 */
@Setter
@Getter
@AllArgsConstructor
public class DeepClone implements Cloneable, Serializable {

    private String name;

    private CloneInner cloneInner;

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepClone clone = (DeepClone) super.clone();
        clone.name = new String(this.name);
        clone.cloneInner = (CloneInner) this.cloneInner.clone();
        return clone;
    }

    @Getter
    @AllArgsConstructor
    public static class CloneInner implements Cloneable, Serializable {

        private String name;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
