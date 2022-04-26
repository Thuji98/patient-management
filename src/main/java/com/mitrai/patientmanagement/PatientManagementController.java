package com.mitrai.patientmanagement;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class PatientManagementController {
    Logger logger= LoggerFactory.getLogger(PatientManagementController.class);

    @GetMapping("say")
    public String hello(){
        return "Hello there!";
    }

    @GetMapping("say1")
    public String hello1(){
        logger.info("Hi from hello1 method!");
        return "Hello there1!";
    }

    @GetMapping("say2")
    public String hello2(){
        logger.info("Hi from hello2 method!");
        return "Hello there2!";
    }

    @GetMapping("say3")
    public String hello3(){
        logger.info("Hi from hello3 method!");
        return "Hello there3!";
    }

    @GetMapping("say4")
    public String hello4(){
        logger.info("Hi from hello4 method!");
        return "Hello there4!";
    }

    @GetMapping("say5")
    public String hello5(){
        logger.info("Hi from hello5 method!");
        return "Hello there5!";

    }

}
