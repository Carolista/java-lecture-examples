package org.LaunchCode.class10lectureexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GalleryController {

    // TODO: Create and use a template called index.html
    // Remember to remove @ResponseBody
    @GetMapping("/")
    @ResponseBody
    public String getHomePageContent() {
        System.out.println("\n*** Home page content requested by browser");
        return "<h2>Midtown Art Gallery</h2>" +
                "<p>Welcome! View our <a href='/collection'>collection</a> of fine art.</p>";
    }

}
