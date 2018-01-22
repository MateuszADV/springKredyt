package pl.mateusz.springKredyt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainGet(){
        return "index";
    }

    @PostMapping("/")
    public String mainPost(@RequestParam("totalCredit") double totalCredit,
                           @RequestParam("income") double income,
                           @RequestParam("numberOfMonths") int numberOfMonths,
                           Model model){

        model.addAttribute("info",canCredit(totalCredit,income,numberOfMonths));
        model.addAttribute("maxCredit",income*numberOfMonths);
        model.addAttribute("numberOfMonths",numberOfMonths);
        return "index";
    }

    private Boolean canCredit(double tc, double ic, int nom){
        return ((tc/nom)<ic);
    }
}
