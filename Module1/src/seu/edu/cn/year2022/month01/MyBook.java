package seu.edu.cn.year2022.month01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyTest
@Book(name = "App", authors = {"A", "B"}, price = 22.3)
public class MyBook {

    @MyTest
    @Book(name = "App+1", authors = {"A", "B"}, price = 22.3, address = "北京")
    public static void main(String[] args) {

        int age = 13;
        System.out.println(age);

    }
}

@interface Book {
    String name();

    String[] authors();

    double price();

    String address() default "上海";

}

@Target({ElementType.METHOD, ElementType.TYPE})//声明只能注解方法 如果要注解成员变量 加field
//注解类的话 加type
@Retention(RetentionPolicy.RUNTIME)//注解存活时间
@interface MyTest {

}