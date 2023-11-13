# 设计模式
## 设计模式的类型
除GOF23种外的设计模式
* 简单工程模式
  * 由一个工厂决定创建哪一种产品类型的实例
* 创建型模式
  * 隐藏了创建对象的过程,通过逻辑方法进行创建对象,而不是通过new关键字进行创建
    * 工厂方法模式
      * 定义一个接口或一个抽象的工厂类,让它实现类(工厂)来决定创建哪一个实例对象
      * 根据每个工厂不同的方法,来产生不同的所需要的对象
      * 工厂方法模式生产的都是相同类型的对象,比如Java课程,Python课程
    * 抽象工程模式
      * 类型公司下的产品,生产汽车,将汽车分为各个零部件进行生产,车架,车门,底盘
      * 抽象工厂模式提供了创建一系列相关或互相依赖对象的接口
    * 建造者模式
      * 将复杂的对象的创建和属性复制所分离
      * 监造的过程和细节我们不需要知道,只需要通过构建者去进行操作即可
    * 原型模式
      * 用于创建重复的对象,能过保证创建对象的性能.
      * 原型设计模式是创建对象的最佳方法
    * 单例模式
      * 在程序种想要操持一个实例对象的，就是用单例设计模式
      * 减少内存开销
        * 懒汉式
          * 在需要使用对象的时候,才会创建
        * 双重检查
          * 通过两个if判断,加上同步锁进行实现
        * 静态内部类
          * 在单例类种,通过私有的静态内部类,创建单例对象
        * 饿汉式
          *  在调用时,就会创建单例对象,通过静态代码块或静态变量直接初始化
        * 枚举
          * 枚举的方法实现单例模式,是最佳的实现方法
          * 它可以有效防止对单例模式的破坏
            * 序列化和反序列的方法破坏单例模式
              * 通过流讲单例对象,序列化到文件中,然后在反序列读取出来
              * 最终通过反序列化的方式创建出一个对象
              * 发现两个对象的内存地址完全不一致,从而破坏了单例设计模式结构
              * 在单例类种,写一个方法名称必须为readResolve
                * 因为在反序列化创建对象时,是通过反射创建的
                * 反射会调用我们自己的readResolve方法
                * 如果重写了,就代表返回自己的单例对象
                * 如果没有重写,会通过反射的方式创建一个新的对象,从而破坏了单例设计模式
                ```java
                    private Object readResolve() {
                        return doubleCheckSingleton;
                    }
                ```
            * 通过反射的方式破坏单例模式
              * 通过字节码对象,创建构造器对象
              * 通过构造器对象,初始化单例对象
                * 由于单例对象的构造方法是私有化的
                * 调用构造器中的方法,赋予权限,创建单例对象
* 结构型模式
  * 主要关注类和对象的组合关系
  * 继承的概念被用来组合接口和定义组合对象,获得新的功能方式
    * 外观模式
      * 
    * 适配器模式
    * 桥接模式
    * 组合模式
    * 装饰模式
    * 享元模式
    * 代理模式
* 行为型模式
  * 主要关注对象之间的通信
    * 责任链模式
    * 命令模式
    * 解释器模式
    * 迭代器模式
    * 中介者模式
    * 备忘录模式
    * 观察者模式
    * 状态模式
    * 策略模式
    * 模板方法模式
    * 访问者模式