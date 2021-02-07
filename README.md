# invoke
1、invoke调用普通方法；
2、当取得了一个类实例化对象之后，下面最需要调用的肯定是类之中的方法，所以可以继续使用Class类取得一个类中所定义的方法定义：
    ·取得全部方法：public Method[] getMethods()throws SecurityException；
    ·取得指定方法：public Method getMethod(Stringname, Class<?>... parameterTypes) 
        throws NoSuchMethodException,SecurityException
    发现以上的方法返回的都是java.lang.reflect.Method类的对象。
3、但是取得了Method类对象最大的作用不再于方法的列出（方法的列出都在开发工具上使用了），但是对于取得了Method类对象之
    后还有一个最大的功能，就是可以利用反射调用类中的方法：
    ·调用方法：public Object invoke(Objectobj, Object... args) throws IllegalAccessException,
    IllegalArgumentException,InvocationTargetException
    之前调用类中方法的时候使用的都是“对象.方法”，但是现在有了反射之后，可以直接利用Object类调用指定子类的操作方法。
    （同时解释一下，为什么setter、getter方法的命名要求如此严格）。