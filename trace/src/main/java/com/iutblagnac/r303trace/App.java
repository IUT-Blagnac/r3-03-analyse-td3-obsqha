package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
    }
/**
 * @author Cardouat Alexi
 *  methode hello() sans paramettre retournant un String
 * @return String "Hello World"
 */  
    public static String hello() {
        return "Hello World!";
    }
/**
    * @author Cardouat Alexi
    *  methode hello() avec un paramettre String le retournant
    * @param param
    * @return String param
    */  
       public static String hello(String param) {
           return param;
       }
}
