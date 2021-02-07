# invoke
1、取得了Class类的对象有什么用处呢？对于对象的实例化操作之前一直依靠构造方法和关键字new完成，可是有了Class类对象之后，现在又提供了另外一种对象的实例化方法：
   ·通过反射实例化对象：public T newInstance() throws InstantiationException,IllegalAccessException；
2、那么现在可以发现，对于对象的实例化操作，除了使用关键字new之外又多了一个反射机制操作， 而且这个操作要比之前使用的new复
   杂一些，可是有什么用？ 对于程序的开发模式之前一直强调：尽量减少耦合，而减少耦合的最好做法是使用接口，但是就算使用了接
   口也逃不出关键字new，所以实际上new是造成耦合的关键元凶。