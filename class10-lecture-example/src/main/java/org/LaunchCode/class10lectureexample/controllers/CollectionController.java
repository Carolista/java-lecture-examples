package org.LaunchCode.class10lectureexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/collection")
public class CollectionController {

    // TODO: Convert this to use a template, collection.html
    // Corresponds to http://localhost:8080/collection
    @GetMapping("")
    public String getCollectionPageContent() {
        System.out.println("\n*** Collection page content requested");
        return "collection/index";
    }

    // TODO: Convert this to use a template, styles.html
    // Corresponds to http://localhost:8080/collection/styles?style=impressionism
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/styles")
    public String acceptQueryParamFromCollectionRoute(@RequestParam String style) {
        System.out.println("\n*** Request submitted with style " + style);
        return "styles";
    }

    // TODO: Convert this to use a template, artwork.html
    // Corresponds to http://localhost:8080/collection/1234
    @GetMapping("/{artworkId}")
    public String acceptPathParamFromCollectionRoute(@PathVariable String artworkId) {
        System.out.println("\n*** GET Request submitted for artworkId " + artworkId);
        return "artwork";
    }

    // TODO: Convert this to use a template, form.html
    // Corresponds to http://localhost:8080/collection/form
    @GetMapping("/form")
    public String displayStyleForm() {
        System.out.println("\n*** Style form submitted");
        return "collection/form";
    }
}
