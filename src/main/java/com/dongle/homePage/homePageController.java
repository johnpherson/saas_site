package com.dongle.homePage;

import com.dongle.homePage.model.homePageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homePageController {
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("homepage", new homePageModel());
        return "homepage";
    }

    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("aboutPage", "this is the about page");
        return "aboutPage";
    }
}
