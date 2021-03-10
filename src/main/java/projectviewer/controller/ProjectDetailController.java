package projectviewer.controller;

import projectviewer.services.ApiHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Controller for project list detail page
 */
@Controller
public class ProjectDetailController {

    @Autowired
    ApiHandlerService apiHandler;

    @GetMapping(value = "/projects/list/detail")
    public String viewAllUserProjects(Model model, @ModelAttribute("token") String token) {

        model.addAttribute("projects",  apiHandler.readProjectDetailtList(token));

        return "user_projects";
    }

    @GetMapping(value = "/home")
    public String redirectToHomePage(Model model) {
        return "redirect:/";
    }
}
