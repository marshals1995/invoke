# invoke
1、以上只是利用了Class类作为了反射实例化对象的基本应用，但是对于一个实例化对象而言，它需要调用类之中的构造方法、
   普通方法、属性，而这些操作都可以通过反射机制完成。
2、调用构造
    使用反射机制也可以取得类之中的构造方法，这个方法在Class类之中已经明确定义了：
    以下两个方法：
    取得一个类的全部构造：
    public Constructor<?>[] getConstructors() throws SecurityException
    取得一个类的指定参数构造：
    public Constructor<T> getConstructor(Class<?>... parameterTypes) 
        throws NoSuchMethodException, SecurityException
    现在发现以上的两个方法返回的都是java.lang.reflect.Constructor类的对象。
3、在之前强调的一个简单Java类必须存在一个无参构造方法，否则要传参。
4、调用无参构造方法实例化对象要比调用有参构造的更加简单、方便，所以在日后的所有开发之中，凡是有简单Java类出现的地方，
   都一定要提供无参构造