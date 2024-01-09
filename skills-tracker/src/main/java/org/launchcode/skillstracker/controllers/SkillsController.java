package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String stepOneMessage() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>Languages we have practiced so far...</h2>" +
                "<ol>" +
                "<li>Java</>" +
                "<li>JavaScript</>" +
                "<li>HTML</>" +
                "</ol>";
    }

    @RequestMapping(value = "formReceived", method = RequestMethod.POST)
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String languageOne, @RequestParam String languageTwo, @RequestParam String languageThree) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<h2>My favorite languages (in order)</h2>" +
                "<ol>" +
                "<li>" + languageOne + "</>" +
                "<li>" + languageTwo + "</>" +
                "<li>" + languageThree + "</>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "form", method = {RequestMethod.GET})//, RequestMethod.POST})
    @ResponseBody
    public String renderForm() {
        return "<body>" +
                "<form action = '/formReceived' method = 'post'>" +
                "<label>Name: <input type = 'text' name = 'name' /></label>" +
                "<br>" +

                "<label>Favorite Language: " +
                "<select name = 'languageOne'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "</select>" +
                "</label>" +
                "<br>" +

                "<label>2nd Fav Language: " +
                "<select name = 'languageTwo'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "</select>" +
                "<br>" +

                "<label>3rd Fav Language: " +
                "<select name = 'languageThree'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "</select>" +
                "<br>" +

                "<input type = 'submit' value = 'Proceed'>" +

                "</form>" +
                "</body>";
    }
}
