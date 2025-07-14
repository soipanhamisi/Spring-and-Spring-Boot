package org.soipan.sqch7ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
    @RequestMapping("/home")
    public String Home(){
        return "homePage.html";
    }
}
