package org.LaunchCode.class08lectureexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
// NOTE: In the video I accidentally called this GalleryControllers
public class GalleryController {

    // TODO: Write a method for the home page (root path)
    // Just display a title for now
    // Also print something to the console to log the call from the browser to the endpoint
    // TODO: After coding the second method, update this method to include a link to to the collection page
    // Use a little HTML to format the text within elements on the page

    // Corresponds to http://localhost:8080
    @GetMapping("/")
    @ResponseBody
    public String getHomePageContent() {
        System.out.println("\n*** Home page content requested by browser");
        return "<h2>Midtown Art Gallery</h2>" +
                "<p>Welcome! View our <a href='/collection'>collection</a> of fine art.</p>";
    }

    // TODO: Write a method to return static content to the collection page
    // Corresponds to http://localhost:8080/collection
//    @GetMapping("/collection")
//    @ResponseBody
//    public String getCollectionPageContent() {
//        System.out.println("\n*** Collection page content requested");
//        return "<p>We have an extensive collection of fine art.</p>";
//    }

    // TODO: Write a method to accept a query parameter, style, for dynamic content
    // It should return some content for the page that makes use of the parameter

    // Corresponds to http://localhost:8080/collection/styles?style=impressionism
//    @GetMapping("/collection/styles")
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/collection/styles")
//    @ResponseBody
//    public String acceptQueryParamFromCollectionRoute(@RequestParam String style) {
//        System.out.println("\nGET Request submitted with style value of " + style);
//        return "<h3>Collection</h3>" +
//                "<p>You are now viewing works of art in the " + style + " style.</p>" +
//                "<p>Click <a href='/form'>here</a> to select a different style.</p>";
//    }

    // TODO: Write a method to accept a path parameter, artworkId
    // It should return some content for the page that makes use of the parameter
    // Corresponds to http://localhost:8080/collection/1234
//    @GetMapping("/collection/{artworkId}")
//    @ResponseBody
//    public String acceptPathParamFromCollectionRoute(@PathVariable String artworkId) {
//        System.out.println("\nGET Request submitted for artworkId " + artworkId);
//        return "<h3>Collection</h3>" +
//                "<p>Here are details of artwork number " + artworkId + ".</p>";
//    }

    // TODO: Write a method for /form that will display a form on the page
    // When the form is submitted, its action should call the /collection controller
    // The input should have the same name as the query param for /collection
    // TODO: Convert to using a POST method and make necessary changes to /collection controller
    // Corresponds to http://localhost:8080/form
//    @GetMapping("/form")
//    @ResponseBody
//    public String displayStyleForm() {
//        System.out.println("\nStyle form submitted");
//        return "<html>" +
//                "<body>" +
//                "<form action='/collection/styles' method='POST'>" +
//                "<p>Enter the style of art you'd like to view:</p>" +
//                "<input type='text' name='style' />" +
//                "<button type='submit'>Submit</button>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    // TODO: Create a new controller called CollectionController and move all the collection-related methods there
    // Adjust everything for a base mapping of route /collection

}
