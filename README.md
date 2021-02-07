# invoke
1、invoke调用成员
2、类之中最后一个组成部分就是成员（Field，也可以称为属性），如果要通过反射取得类的成员可以使用方法如下：
    ·取得本类的全部成员：public Field[]getDeclaredFields() throws SecurityException；
    ·取得指定的成员：public FieldgetDeclaredField(String name) throws NoSuchFieldException, SecurityException；
    这两个方法的返回值类型是java.lang.reflect.Field类的对象，下面首先观察如何取得一个类之中的全部属性。
3、但是找到Field实际上就找到了一个很有意思的操作，在Field类之中提供了两个方法：
    ·设置属性内容（类似于：对象.属性= 内容）：public void set(Object obj,Object value)
    throwsIllegalArgumentException, IllegalAccessException；
    ·取得属性内容（类似于：对象.属性）：public Object get(Object obj)
    throwsIllegalArgumentException, IllegalAccessException
    可是从类的开发要求而言，一直都强调类之中的属性必须封装，所以现在调用之前要想办法解除封装。
    ·解除封装：public voidsetAccessible(boolean flag) throws SecurityException；