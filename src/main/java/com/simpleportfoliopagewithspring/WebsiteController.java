package com.simpleportfoliopagewithspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

    @GetMapping("")
    public String showHomePage(){
        return "index";
    }


    @GetMapping("my-projects") // endpoint
    public String displayServicesPage() {
        return "projects"; // html file
    }

    @GetMapping("contact-me") // endpoint
    public String displayContactPage() {
        return "contact"; // html file
    }

}
