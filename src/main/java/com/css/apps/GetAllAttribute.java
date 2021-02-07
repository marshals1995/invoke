package com.css.apps;

import java.lang.reflect.Field;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
public class GetAllAttribute {
    public static void main(String[] args) throws ClassNotFoundException {
        // 取得Class对象
        Class<?> cls = Class.forName("com.css.apps.Person") ;
        // 取得全部属性
        Field field [] = cls.getDeclaredFields() ;
        for(int x = 0; x < field.length; x++) {
            System.out.println(field[x]);
        }

    }
}
