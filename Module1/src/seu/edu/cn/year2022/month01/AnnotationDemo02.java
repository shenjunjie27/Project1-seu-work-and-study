package seu.edu.cn.year2022.month01;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class AnnotationDemo02 {
    @Test
    public void parseClass(){
        
    }


}

@BookNew(value = "A", authors = {"JAY", "K"})
class BookStore {
    @BookNew(value = "B", authors = {"JJ", "Jason"})
    public void run() {

    }

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface BookNew {
    String value();

    double price() default 100;

    String[] authors();
}