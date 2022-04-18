package com.mitrai.patientmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PatientManagementController {

    @GetMapping("say")
    public String hello(){
        return "Hello there!";
    }

}
