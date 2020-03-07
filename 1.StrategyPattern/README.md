# 策略模式

在 [nopattern](./src/main/java/org/potter/strategy/nopattern) 目录下是没有使用模式的代码，如果要在其中的父类中添加fly方法，

那么他的所有子类中将继承该fly方法，这会导致某些不该有fly()的子类也拥有了这个方法。

当然可以在不希望有fly() 方法的子类中覆盖对应的方法。[NoPatternDuckTest](./src/test/java/org/potter/stategy/nopattern/NoPatternDuckTest.java)是对创建的子类功能进行的测试。

如果需求不断的变更，父类需要不断的修改，子类可能需要不断的跟着重写各种方法。

设计模式第一条: 将变化的部分和不变化的部分进行分离

在 [pattern](./src/main/java/org/potter/strategy/pattern) 目录下采用了将变化的部分进行单独抽取的方式进行封装。

