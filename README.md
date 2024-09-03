Instructions

```
export LEYDEN_HOME=/path/to/leyden/jdk
mvn clean install
```

It should produce the following:

```
Exception in thread "main" java.lang.ExceptionInInitializerError
at com.redhat.leyden.Main.main(Main.java:7)
Caused by: java.lang.NullPointerException
at org.wildfly.security.WildFlyElytronBaseProvider.putMakedPasswordImplementations(WildFlyElytronBaseProvider.java:112)
at org.wildfly.security.WildFlyElytronBaseProvider.putPasswordImplementations(WildFlyElytronBaseProvider.java:107)
at org.wildfly.security.password.WildFlyElytronPasswordProvider.<init>(WildFlyElytronPasswordProvider.java:43)
at org.wildfly.security.password.WildFlyElytronPasswordProvider.<clinit>(WildFlyElytronPasswordProvider.java:36)
... 1 more
[ERROR] Command execution failed.
```