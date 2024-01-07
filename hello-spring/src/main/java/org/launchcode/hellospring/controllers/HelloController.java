package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //handle request at path http://localhost:8080/hello

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    //handle request at path //http://localhost:8080/hello/goodbye
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }

    //handle requests of the form http://localhost:8080/hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }

    //handle requests of the form http://localhost:8080/hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    //handles requests for http://localhost:8080/hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/hello/hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<select name='language'>" +
                "<option value='1'>English</option>" +
                "<option value='2'>French</option>" +
                "<option value='3'>Spanish</option>" +
                "<option value='4'>German</option>" +
                "<option value='5'>Italian</option>" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="hello", method = RequestMethod.POST)
    @ResponseBody
    public String myGreeting(@RequestParam String name, @RequestParam String language) {
        return createMessage(name, language);



    }

    public static String createMessage(String name, String language) {
        String sayHello = "";
        if (language.equals("1")) {
            sayHello = "Hello";
        } else if (language.equals("2")) {
            sayHello = "Bonjour";
        } else if (language.equals("3")) {
            sayHello = "Hola";
        } else if (language.equals("4")) {
            sayHello = "Hallo";
        } else if (language.equals("5")) {
            sayHello = "Ciao";
        }
        return sayHello + " " + name + "!";
    }

}