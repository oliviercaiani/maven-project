package com.example;


public class Greeter {

  
  public Greeter() {

  }

 /**
* @param someone name of personn
* @return greeting string
*/
  
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
