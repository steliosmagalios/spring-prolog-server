package me.stelios.prologserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

    @GetMapping("/schedule")
    public String schedule() {
        return "Scheduling time!";
    }

}
