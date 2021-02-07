package com.css.apps;

import java.lang.reflect.Constructor;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class GetConstructors {
    class Person { // CTRL + K
        public Person() {}
        public Person(String name) {}
        public Person(String name,int age) {}
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //取得Class对象
        Class<?> cls = Class.forName("com.css.apps.Person");
        //取得全部构造
        Constructor<?> cons [] = cls.getConstructors();
        for(int x = 0; x < cons.length; x++) {
            System.out.println(cons[x]);
        }
    }
}
