package org.gangel.javainterop.nullability;

public class JavaRun {

    public static void main(String... args) {
        System.out.println(KotlinFun.funWithNullableArgument(123, 123));
        System.out.println(KotlinFun.funWithNullableArgument(444, null));
        System.out.println(KotlinFun.funWithNullableArgument("text", null));
        System.out.println(KotlinFun.funWithNullableArgument("text", ".suffix"));
        System.out.println(KotlinFun.funWithNullableArgument(null, ".suffix"));
        System.out.println(KotlinFun.funWithNullableResult(234));
        System.out.println(KotlinFun.funWithNullableResult(232));
    }
}
