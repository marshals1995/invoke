package com.css.apps;

import java.lang.reflect.Method;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class GetAllMethods {
    /**
     *取得一个类之中所定义的全部方法
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // 取得Class对象
        Class<?> cls = Class.forName("com.css.apps.Person");
        // 取得全部方法
        Method met[] = cls.getMethods();
        for (int x = 0; x < met.length; x++) {
            System.out.println(met[x]);
        }

    }
}
