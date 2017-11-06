package me.soulyana.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {
        LocalDate date= LocalDate.now();
        DateTimeFormatter today = (DateTimeFormatter.ofPattern("EEEE"));
        DateTimeFormatter currDate = DateTimeFormatter.ofPattern("dd MMMM yyyy");


        model.addAttribute("today", "Today is: " + date.format(today));
        model.addAttribute("currDate", "Current date: " + date.format(currDate));
        return "index";
    }
}
