package org.LaunchCode.class08lectureexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/collection")
@ResponseBody
public class CollectionController {

    // Corresponds to http://localhost:8080/collection
    @GetMapping("")
    public String getCollectionPageContent() {
        System.out.println("\n*** Collection page content requested");
        return "<p>We have an extensive collection of fine art.</p>" +
                "<p>Click <a href='/collection/form'>here</a> to select a style.</p>";
    }

    // Corresponds to http://localhost:8080/collection/styles?style=impressionism
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/styles")
    public String acceptQueryParamFromCollectionRoute(@RequestParam String style) {
        System.out.println("\n*** Request submitted with style " + style);
        return "<h3>" + style.toUpperCase() + " COLLECTION</h3>" +
                "<p>You are now viewing works of art in the " + style + " style.</p>" +
                "<p>Click <a href='/collection/form'>here</a> to select a different style.</p>";
    }

    // Corresponds to http://localhost:8080/collection/1234
    @GetMapping("/{artworkId}")
    public String acceptPathParamFromCollectionRoute(@PathVariable String artworkId) {
        System.out.println("\nGET Request submitted for artworkId " + artworkId);
        return "<h3>Collection</h3>" +
                "<p>Here are details of artwork number" + artworkId + ".</p>";
    }

    // Corresponds to http://localhost:8080/collection/form
    @GetMapping("/form")
    public String displayStyleForm() {
        System.out.println("\nStyle form submitted");
        return "<html>" +
                "<body>" +
                "<form action='/collection/styles' method='POST'>" +
                "<p>Enter the style of art you'd like to view:</p>" +
                "<input type='text' name='style' />" +
                "<button type='submit'>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
