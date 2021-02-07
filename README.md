# invoke
1、概念：
    反射就是将类别的各个组成部分进行剖析，可以得到每个组成部分，就可以对每一部分进行操作。
    在比较复杂的程序或框架中来使用反射技术，可以简化代码提高程序的复用性。
2、反射之中包含了一个“反”的概念，所以要想解释反射就必须先从“正”开始解释，一般而言，当用户使用一个类的时候，
    应该先知道这个类，而后通过这个类产生实例化对象，但是“反”指的是通过对象找到类。
3、例如：
    packagecn.mldn.demo;
    classPerson {}
    publicclassTestDemo {
            publicstaticvoidmain(String[] args) throwsException {
            Person per = newPerson() ; // 正着操作
            System.out.println(per.getClass().getName()); // 反着来
        }
    }
    以上的代码使用了一个getClass()方法，而后就可以得到对象所在的“包.类”名称，这就属于“反”了，
    但是在这个“反”的操作之中有一个getClass()就作为发起一切反射操作的开端。
    Person的父类是Object类，而上面所使用getClass()方法就是Object类之中所定义的方法。
    ·取得Class对象：public final Class<?> getClass()，反射之中的所有泛型都定义为?，返回值都是Object。
    而这个getClass()方法返回的对象是Class类的对象，所以这个Class就是所有反射操作的源头。