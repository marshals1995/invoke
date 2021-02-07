package com.css.apps;

import java.lang.reflect.Method;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class GetTargetMethods {
    public static void main(String[] args) throws Exception {
        // 取得Class对象
        Class<?> cls = Class.forName("com.css.apps.Person");
        // 实例化对象，没有向Person转型
        Object obj = cls.newInstance();
        // 要调用类之中的属性
        String attribute = "name";
        Method setMet = cls.getMethod("set" + initcap(attribute), String.class);
        Method getMet = cls.getMethod("get" + initcap(attribute));
        // 等价于：Person对象.setName("张三")
        setMet.invoke(obj, "张三");
        // 等价于：Person对象.getName()
        System.out.println(getMet.invoke(obj));
    }

     public static String initcap(String str) {
        return str.substring(0, 1).toUpperCase().concat(str.substring(1));
    }
}
