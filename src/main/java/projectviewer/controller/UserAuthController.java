package projectviewer.controller;

import projectviewer.model.entity.UserCredentials;
import projectviewer.services.ApiHandlerService;
import projectviewer.respository.UserCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Controller for user authentication page
 */
@Controller
public class UserAuthController {

    @Autowired
    UserCredentialsRepository userCredentialsRepository;

    @Autowired
    ApiHandlerService apiHandler;

    @GetMapping("/")
    public String homePage(Model model) {
        return "user_credentials";
    }

    @PostMapping(value = "/authuser")
    public RedirectView findUserInDatabase(Model model, RedirectAttributes redirectAttributes, @RequestParam String userName, @RequestParam String password)
    {
        if (userCredentialsRepository.findByUserName(userName) == null) {
            userCredentialsRepository.save(new UserCredentials(userName, password));
        }

        String token = apiHandler.getToken(userName, password);
        if(token == null) {
            return new RedirectView("/error");
        }
        redirectAttributes.addFlashAttribute("token", token);

        return new RedirectView("/projects/list/detail", true);
    }
}
