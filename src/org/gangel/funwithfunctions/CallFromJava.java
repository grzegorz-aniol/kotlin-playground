package org.gangel.funwithfunctions;

public class CallFromJava {

  public static void main(String[] args) {
    FunWithFunctions.defaultParameters("Veronica", 13);
    // FunWithFunctions.defaultParameters("Mattew"); <-- compilation error, no default arguments in Java

    // if Kotlin function specify @Overload then compiler generates overloaded
    // functions that specify additional arguments
    FunWithFunctions.defaultParametersWithOverloadForJava("Mark");
    FunWithFunctions.defaultParametersWithOverloadForJava("Mark", 22);
  }

}
