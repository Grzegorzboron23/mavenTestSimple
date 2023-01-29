package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

   public static final List<Book> books = new ArrayList<>();

   static {
       books.add(new Book("Tolkien" , "Lord of the ringd" , 5));
       books.add(new Book("Tolkiens" , "Lord of the ringd2" , 2));
       books.add(new Book("Tolkienien" , "Lord of the ringd3" , 3));
   }

   @GetMapping("books/all")
   @ResponseBody
   public String getAllBooks() throws JsonProcessingException {
       ObjectMapper objectMapper = new ObjectMapper();
      return objectMapper.writeValueAsString(books);


   }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world";
    }

@GetMapping("/hello2")
@ResponseBody
    public String hello2(@RequestParam (name = "name" , required = false)String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/hello3/{name}")
    @ResponseBody
    public String hello3(@PathVariable("name")String name){
        return "Hello " + name + "!";
    }
}
