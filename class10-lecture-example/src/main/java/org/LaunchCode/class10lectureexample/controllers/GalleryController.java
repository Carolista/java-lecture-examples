package org.LaunchCode.class10lectureexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {

    // TODO: Create and use a template called index.html
    // Remember to remove @ResponseBody
    // Corresponds to http://localhost:8080
    @GetMapping("/")
    public String getHomePageContent(Model model) {
        System.out.println("\n*** Home page content requested by browser");
        model.addAttribute("title", "Welcome");
        return "index";
    }

    /*
        Fragments:
          - Header with link to Home & Collection

        Main page - Header + greeting + large image (eventually)
        Collection - List of artworks (eventually link to individual pages) plus link to add more

     */

}
