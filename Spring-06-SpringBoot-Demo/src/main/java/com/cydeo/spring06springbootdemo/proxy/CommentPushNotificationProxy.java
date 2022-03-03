package com.cydeo.spring06springbootdemo.proxy;

import com.cydeo.spring06springbootdemo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendcomment(Comment comment) {
        System.out.println(" Sending Push "+comment.getText());
    }

    /** When there are 2 Components:  NoUniqueBeanDefinitionException: No qualifying bean of type
     *@Primary solves the issue
     *@Qualifier solves as well
    /* expected single matching bean but found 2: commentPushNotificationProxy,emailCommentNotificationProxy
    /Library/Java/JavaVirtualMachines/jdk-14.0.2.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49827:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/yasarozen/IdeaProjects/spring-framework/Spring-04-Abstraction/target/classes:/Users/yasarozen/.m2/repository/org/springframework/spring-context/5.3.15/spring-context-5.3.15.jar:/Users/yasarozen/.m2/repository/org/springframework/spring-aop/5.3.15/spring-aop-5.3.15.jar:/Users/yasarozen/.m2/repository/org/springframework/spring-beans/5.3.15/spring-beans-5.3.15.jar:/Users/yasarozen/.m2/repository/org/springframework/spring-core/5.3.15/spring-core-5.3.15.jar:/Users/yasarozen/.m2/repository/org/springframework/spring-jcl/5.3.15/spring-jcl-5.3.15.jar:/Users/yasarozen/.m2/repository/org/springframework/spring-expression/5.3.15/spring-expression-5.3.15.jar:/Users/yasarozen/.m2/repository/org/projectlombok/lombok/1.18.22/lombok-1.18.22.jar com.cydeo.CydeoApp
Feb 22, 2022 8:09:53 PM org.springframework.context.support.AbstractApplicationContext refresh
WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'commentService' defined in file [/Users/yasarozen/IdeaProjects/spring-framework/Spring-04-Abstraction/target/classes/com/cydeo/service/CommentService.class]: Unsatisfied dependency expressed through constructor parameter 1; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.cydeo.proxy.CommentNotificationProxy' available: expected single matching bean but found 2: commentPushNotificationProxy,emailCommentNotificationProxy
Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'commentService' defined in file [/Users/yasarozen/IdeaProjects/spring-framework/Spring-04-Abstraction/target/classes/com/cydeo/service/CommentService.class]: Unsatisfied dependency expressed through constructor parameter 1; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.cydeo.proxy.CommentNotificationProxy' available: expected single matching bean but found 2: commentPushNotificationProxy,emailCommentNotificationProxy
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800)
	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:229)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:953)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
	at org.springframework.context.annotation.AnnotationConfigApplicationContext.<init>(AnnotationConfigApplicationContext.java:93)
	at com.cydeo.CydeoApp.main(CydeoApp.java:17)
Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.cydeo.proxy.CommentNotificationProxy' available: expected single matching bean but found 2: commentPushNotificationProxy,emailCommentNotificationProxy
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveNotUnique(DependencyDescriptor.java:220)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1367)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1309)
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887)
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791)
	... 14 more
     */
}
