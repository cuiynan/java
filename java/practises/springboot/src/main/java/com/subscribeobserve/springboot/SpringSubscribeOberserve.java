package com.subscribeobserve.springboot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : cuiyingnan
 * @date : 2019/8/27 14:16
 * @desc : 使用spring实现订阅与发布
 */
public class SpringSubscribeOberserve {

    public static void main(String[] args) {
        event1();
        event2();
    }

    public static void event1() {
        AnnotationConfigApplicationContext context = new MyContext().getContext();
        //发布
        context.publishEvent(new MyEvent("test"));
    }

    public static void event2() {
        AnnotationConfigApplicationContext context = new MyContext().getContext();
        context.publishEvent(new MyEvent("中国"));
    }
}


class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }
}

class MyContext {
    AnnotationConfigApplicationContext context;

    /**
     * 绑定一次便可
     */
    public MyContext() {
        if (context == null) {
            context = new AnnotationConfigApplicationContext();
            //注册监听
            context.addApplicationListener(new ApplicationListener<MyEvent>() {
                @Override
                public void onApplicationEvent(MyEvent applicationEvent) {
                    System.out.println(applicationEvent.getSource());
                }
            });
            context.refresh();
        }
    }

    public AnnotationConfigApplicationContext getContext() {
        return context;
    }
}
