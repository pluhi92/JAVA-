package com.pluhi;

import java.lang.annotation.*;


public class Annotation {

    @Target(ElementType.TYPE)                               //Meta Annotation
    @Retention(RetentionPolicy.RUNTIME)
    @interface SmartPhone {                                 //Marker Annotation

        String os() default "Symbian";                      //Single Value Annotation

        int version() default 1;                            // Multi Value Annotation
    }

    @SmartPhone(os = "Android", version = 6)
    static
    class NokiaASeries {
        String model;
        int size;

        public NokiaASeries(String model, int size) {
            this.model = model;
            this.size = size;
        }
    }

    public static class AnnotationDemo {
        public static void main(String[] args) {

            NokiaASeries obj = new NokiaASeries("Fire", 5);

            Class c = obj.getClass();
            Annotation an = c.getAnnotation(SmartPhone.class);
            SmartPhone s = (SmartPhone) an;
            System.out.println(s.os());
        }
    }
}
