package sample.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// annotation will be stored with class in compiled code
@Retention(value = RetentionPolicy.RUNTIME)
// annotations will be applicable only for methods
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface NumericRepresentation {
    String description() default "";

    double numericRepresentation() default 0.0D;
}
