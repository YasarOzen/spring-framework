package com.cydeo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

            ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

            Java java = container.getBean(Java.class);
            java.getTeachingHours();
/* ----- When not autowired officehours return null -------
/Library/Java/JavaVirtualMachines/jdk-14.0.2.jdk/Contents/Home/bin/java
-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=64747:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath
/Users/yasarozen/IdeaProjects/spring-framework/Spring-03-Core-DI/target/classes:
/Users/yasarozen/.m2/repository/org/springframework/spring-context/5.3.15/spring-context-5.3.15.jar:
/Users/yasarozen/.m2/repository/org/springframework/spring-aop/5.3.15/spring-aop-5.3.15.jar:
/Users/yasarozen/.m2/repository/org/springframework/spring-beans/5.3.15/spring-beans-5.3.15.jar:
/Users/yasarozen/.m2/repository/org/springframework/spring-core/5.3.15/spring-core-5.3.15.jar:
/Users/yasarozen/.m2/repository/org/springframework/spring-jcl/5.3.15/spring-jcl-5.3.15.jar:
/Users/yasarozen/.m2/repository/org/springframework/spring-expression/5.3.15/spring-expression-5.3.15.jar:
/Users/yasarozen/.m2/repository/org/projectlombok/lombok/1.18.22/lombok-1.18.22.jar com.cydeo.CydeoApp
Exception in thread "main" java.lang.NullPointerException
	at com.cydeo.Java.getTeachingHours(Java.java:11)
	at com.cydeo.CydeoApp.main(CydeoApp.java:13)

---------------------------------------------------------------
 */

    }
}
