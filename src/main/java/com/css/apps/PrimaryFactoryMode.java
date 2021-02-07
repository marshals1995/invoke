package com.css.apps;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
interface Fruit {
    public void eat();
}

class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃苹果。");
    }
}
class Factory {
    public static Fruit getInstance(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        }
        return null;
    }
}

/**
 * @author marshal
 */
public class PrimaryFactoryMode {
    public static void main(String[] args) {
        Fruit f = Factory.getInstance("apple");
        f.eat();
    }
}
