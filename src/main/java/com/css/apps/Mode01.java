package com.css.apps;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class Mode01 {
    /**
     * 通过Object类的getClass()方法取得，基本不用
     */
    public static void main(String[] args) {
        //正着操作
        Person per = new Person();
        //取得Class对象
        Class<?> cls = per.getClass();
        //反着操作
        System.out.println(cls.getName());
    }
}
