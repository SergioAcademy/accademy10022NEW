package Lesson10;

public @interface Producer {
	String info() ;
     int startYear() default 0;
	String country() default "Беларусь";
    String[] founderFullName() default {};
}