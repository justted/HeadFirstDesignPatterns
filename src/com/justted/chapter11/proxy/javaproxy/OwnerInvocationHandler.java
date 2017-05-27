package com.justted.chapter11.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by justted on 2017/5/19.
 */
public class OwnerInvocationHandler implements InvocationHandler {  //所有调用处理器都实现InvocationHandler接口
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }    //将person传入构造器，并保持它的引用

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {    //每次proxy的方法被调用，就会导致proxy调用此方法
        try {
            if (method.getName().startsWith("get")){
                return method.invoke(person, args);    //这里返回的是一个object对象。这里的参数分别是被调用的对象和使用原始的变量
            }else if (method.getName().startsWith("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if (method.getName().startsWith("set")){
                return method.invoke(person, args);
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
