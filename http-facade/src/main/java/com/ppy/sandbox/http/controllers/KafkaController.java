package com.ppy.sandbox.http.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "jms", produces = MediaType.APPLICATION_JSON_VALUE)
public class KafkaController {

    @RequestMapping(value = "/send/{msg}", produces = MediaType.APPLICATION_JSON_VALUE, method = GET)
    public String send(@PathVariable String msg, HttpServletRequest request) {
        return "It is already ready.";
    }

}
