模版方法模式（Template Method）
准备一个抽象类，将部分逻辑以具体方法的形式实现，然后申明一些抽象方法来迫使子类实现剩余的
逻辑。不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。


模版方法模式的结构

抽象模板角色：
1.定义了一个或多个抽象操作，以便让子类实现。
2.定义并实现了一个模板方法。

具体模板角色：
1.实现父类所定义的一个或多个抽象方法。
2.每一个抽象模板角色都可以有任意多个具体模板角色与之对应，而每一个具体模板角色都可以
给出这些抽象方法的不同实现


造电脑的例子

抽象模板角色：Template类
具体模板类的角色：NotePC类和PC类

Java语言里面使用过的模板方法模式

HttpServlet技术
HttpServlet类提供了一个service（）方法。这个方法调用了一个或者几个do方法，完成对客户端调用的处理。
这些do方法则要由具体的HttpServler类提供。那么这里的service（）方法就是模版方法。