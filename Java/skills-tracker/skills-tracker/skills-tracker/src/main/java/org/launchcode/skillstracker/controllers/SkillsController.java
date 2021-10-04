package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String skills(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few Skills we would like to learn. Here is the list. </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping(value = "form")
    @ResponseBody
    public String skillForm(){
        return  "<form method ='post'>" +
                "<label> First Name:" +
                " <input type='text' name='name'/></label>" +
                                                "</br>" +
                "<label> My Favorite language: </br> </label>" +
                "<select name='firstSkill'/>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "<select/>" +
                "<br>" +
                "<label> My Second Favorite language: </br> </label>" +
                "<select name='secondSkill'/>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "<select/>" +
                "<br>" +
                "<label> My Third Favorite language: </br> </label>" +
                "<select name='thirdSkill'/>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "<select/>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit'/>" +
                "</form>";

    }

    //    @RequestMapping(value = "listSkills", method = {RequestMethod.GET, RequestMethod.POST})
    @PostMapping(value = "form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstSkill, @RequestParam String secondSkill, @RequestParam String thirdSkill) {

        return "<h2>" + name +  "</h2>" +
                "<ol>" +
                "<li>" + firstSkill + "</li>" +
                "<li>" + secondSkill + "</li>" +
                "<li>" + thirdSkill + "</li>" +
                "</ol>";
    }


}
