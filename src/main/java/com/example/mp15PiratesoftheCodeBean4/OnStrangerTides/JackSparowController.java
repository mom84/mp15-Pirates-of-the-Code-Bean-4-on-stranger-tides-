package com.example.mp15PiratesoftheCodeBean4.OnStrangerTides;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class JackSparowController {

    private boolean mermaid = true;
    private boolean tear = false;
    private boolean chalice = false;
    private boolean drink = false;
    private String sss;

    @GetMapping("/sparow")
    String page(){
        return "sparow";
    }

    @ModelAttribute("mermaid")
    boolean getMermaid(){
        return mermaid;
    }

    @ModelAttribute("tear")
    boolean getTear(){
        return tear;
    }

    @ModelAttribute("chalice")
    boolean getChalice(){
        return chalice;
    }

    @ModelAttribute("drink")
    boolean getDrink(){
        return drink;
    }

    @ModelAttribute("sss")
    String getsss(){
        return sss;
    }

    @PostMapping("/sparow")
    String mermaid(@RequestBody String btn1, @RequestBody String btn2 , @RequestBody String btn3, @RequestBody String btn4){

    System.out.println(btn1);

    if(btn1.equalsIgnoreCase("btn1=one"))
        tear=true;
    if(btn2.equalsIgnoreCase("btn2=two"))
        chalice=true;
    if(btn3.equalsIgnoreCase("btn3=three"))
        drink=true;
    if(btn4.equalsIgnoreCase("btn4=four"))
        sss = "I am Immortall";

    return "redirect:/sparow";
    }


}
