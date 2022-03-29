package com.ibs;

import com.airbnb.services.AirlineService;
//Package 'com.airbnb.util' is declared in module 'airlines', which does not export it to module 'app'
//import com.airbnb.util.AirlineUtil;
import com.mycom.greeter.Greeter;

public class App {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        AirlineService airlineService = new AirlineService();
        airlineService.findAll().forEach(System.out::println);
        //Package 'com.airbnb.util' is declared in module 'airlines', which does not export it to module 'app'
  //      AirlineUtil  s = new AirlineUtil();
    }
}
