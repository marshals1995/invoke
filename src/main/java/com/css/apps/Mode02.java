package com.css.apps;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class Mode02 {
    /**
     * 使用“类.class”取得，在日后学习Hibernate开发的时候使用
     */
    public static void main(String[] args) {
        //取得Class对象
        Class<?> cls = Person.class;
        //反着操作
        System.out.println(cls.getName());
    }
}
