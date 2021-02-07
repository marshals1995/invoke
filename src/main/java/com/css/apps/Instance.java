package com.css.apps;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class Instance {

    public static void main(String[] args) throws Exception {
        //取得Class对象
        Class<?> cls = Class.forName("com.css.apps.Person");
        //实例化对象，和使用关键字new一样
        Object obj = cls.newInstance();
        //向下转型
        Person per = (Person) obj;
        System.out.println(per);

    }
}
