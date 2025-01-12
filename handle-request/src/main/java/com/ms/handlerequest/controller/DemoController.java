package com.ms.handlerequest.controller;

import com.ms.handlerequest.dto.requests.GreetingRequest;
import com.ms.handlerequest.dto.responses.GreetingResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    // Demo for path variable
    @GetMapping("/greeting/{name}")
    public String handlePathVariable(@PathVariable String name) {
        return "Hello " + name;
    }

    // Demo for request parameter
    @GetMapping("/greeting")
    public String handleRequestParameter(
            @RequestParam(
                    value="username",
                    defaultValue = "user"
            ) String name) {

        return "Hello " + name;
    }

    // Demo for request body
    @GetMapping("/signup")
    public GreetingResponse signUp(HttpServletRequest request, @RequestBody GreetingRequest greetingRequest) {
        GreetingResponse response = new GreetingResponse();
        response.setMessage(greetingRequest.getGreeting() + " " + greetingRequest.getName());
        response.setStatusCode("200");
        return response;
    }

    // Demo for reading request header
    @GetMapping("/greetingheader")
    public String handleRequestHeader(HttpServletRequest request) {
        return "Hello " + request.getHeader("name");
    }

}
