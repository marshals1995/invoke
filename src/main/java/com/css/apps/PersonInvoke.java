package com.css.apps;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author marshal
 * @date 2021/2/5
 * @description
 */
public class PersonInvoke {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取字节码对象
        Class<?> clazz = Class.forName("com.css.apps.Person");
        //获取method对象
        Method setName = clazz.getMethod("setName", String.class);
        Method getName = clazz.getMethod("getName");
        Person person = new Person();
        //调用invoke方法来调用
        setName.invoke(person,"marshal");
        System.out.println(getName.invoke(person));
    }
}
