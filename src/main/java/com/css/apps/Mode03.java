package com.css.apps;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class Mode03 {
    /**
     * 使用Class类内部定义的一个static方法，主要使用
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //取得Class对象
        Class<?> cls = Class.forName("com.css.apps.Person");
        //反着操作
        System.out.println(cls.getName());
    }
}
