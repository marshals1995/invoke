package com.css.apps;

/**
 * @author marshal
 * @date 2021/2/7
 * @description
 */
interface Fruits {
    public void eat();
}

class Apples implements Fruits {
    @Override
    public void eat() {
        System.out.println("吃苹果。");
    }
}

class Orange implements Fruits {
    @Override
    public void eat() {
        System.out.println("吃橘子。");
    }
}
class Factorys {
    public static Fruits getInstance(String className) {
        Fruits f = null;
        try {
            f = (Fruits) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
public class InvokeFactoryMode {
    public static void main(String[] args) {
        Fruits f = Factorys.getInstance("com.css.apps.Orange");
        f.eat();
    }
}
