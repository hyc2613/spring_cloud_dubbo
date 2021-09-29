关于SPI的测试代码。

SPI借助于ServiceLoader，用来加载某些接口的实现类。
比如JDBC的各个数据库的driver实现类。

以前是需要 Class.forName("com.mysql.driver.Driver");
后来应用了SPI之后就不需要这么做了。