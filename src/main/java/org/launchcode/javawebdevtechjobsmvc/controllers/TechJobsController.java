package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController(){
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
    }

    @ModelAttribute("actions")
    static HashMap<String, String> getActionChoices(Model model){
        model.addAttribute("actions", actionChoices);
        return actionChoices;
    }
}
