package seu.edu.cn.year2022.month02;


import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Mybook(
        name = "《网络安全法》", authors = {"K", "JAY"}, price = 20.5
)

public class AnnotationDemo01 {

}



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//注解
//注解可以有属性，属性必须带（）
@interface Mybook {
    String name();

    String[] authors();

    double price();

    String address() default "广州";
}

