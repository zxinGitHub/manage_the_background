package com.zhangxin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ElementType.METHOD 用于描述方法
 * ElementType.TYPE   用于描述类、接口（包括注解类型）或enum类型
 * ElementType.CONSTRUCTOR  用于描述构造器
 * ElementType.FIELD  用于描述作用域
 * ElementType.LOCAL_VARIABLE 用于描述本地变量
 * ElementType.PACKAGE  用于描述包
 * ElementType.PARAMETER  用于描述参数
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReadOnlyConnection {
    String value();
}
