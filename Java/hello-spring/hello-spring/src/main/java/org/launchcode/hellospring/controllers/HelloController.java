package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@ResponseBody

public class HelloController {

    //Handles request a path localhost:8080
    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello, Spring 8080!";
    }

    //Handles request a path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello1() {
//        return "Hello, Spring!";
//    }

    //lives at /goodbye
    @GetMapping("goodbye")
    @ResponseBody
   public String goodbye() {
        return "Goodbye, Spring!";
    }

    //Handles a request of the form /hello?name=LaunchCode
//    @RequestMapping(method ={RequestMethod.GET, RequestMethod.POST}, value = "hello")
//   @GetMapping("hello")
//   @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name) {
//       return "Hello, " + name + "!";
//   }

    // Responds to get requests at /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
   }

//    @GetMapping("venus/{orbiter}")
//    @ResponseBody
//    public String venusOrbiter(@PathVariable String orbiter) {
//        return orbiter + " currently orbits Venus.";
//    }
//
    //Display the form
    @GetMapping("form")
    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submits a request to /hello above
                "<input type='text' name='name'>" +
                "<select name='language'>" +
                   "<option value='english' selected >English Value</option>" +
                    "<option value='french' >French Value</option>" +
                    "<option value='italian'>Italian Value</option>" +
                "<option value='spanish' >Spanish Value</option>" +
                "<option value='german' >German Value</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, String language) {
        if (name == null || name == "") {
            name = "World";
        }
        return createMessage(name, language);
    }

    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("english")) {
            greeting = "Hello";
        } else if (l.equals("french")) {
            greeting = "Bonjour";
        } else if (l.equals("italian")) {
            greeting = "Bonjourno";
        } else if (l.equals("spanish")) {
            greeting = "Hola";
        } else if (l.equals("german")) {
            greeting = "Hallo";
        }
        return greeting + " " + n;
    }
}
