package com.css.apps;

import java.lang.reflect.Field;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class OperateAttribute {
    public static void main(String[] args) throws Exception {
        // 取得Class对象
        Class<?> cls = Class.forName("com.css.apps.Person");
        // 对象实例化属性才会分配空间
        Object obj = cls.newInstance();
        // 找到name属性
        Field nameField = cls.getDeclaredField("name") ;
        // 解除封装了
        nameField.setAccessible(true) ;
        // Person对象.name = "张三"
        nameField.set(obj, "张三") ;
        // Person对象.name
        System.out.println(nameField.get(obj));
    }
}
