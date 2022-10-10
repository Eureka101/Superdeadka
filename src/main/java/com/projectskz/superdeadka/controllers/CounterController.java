package com.projectskz.superdeadka.controllers;

import com.projectskz.superdeadka.dao.ArrivalDate;
import com.projectskz.superdeadka.services.CounterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class CounterController {
    private CounterService service;
    private ArrivalDate arrDate;

    public CounterController(CounterService service, ArrivalDate date) {
        this.service = service;
        arrDate = date;
    }

    @GetMapping("/counter")
    public String getCounter(Model model) {
        model.addAttribute("line", service.endTime(arrDate.getDate()));
        return "legal_counter";
    }

    @GetMapping("/main")
    public String getMain() {
        return "main";
    }

    @PostMapping("/set_date")
    public String setDate(@RequestParam String adate){
        arrDate.setDate(LocalDate.parse(adate));
        return "redirect:/counter";
    }

}
