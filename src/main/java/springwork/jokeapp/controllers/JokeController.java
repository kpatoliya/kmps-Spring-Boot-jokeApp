package springwork.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springwork.jokeapp.services.JokeService;

/*** Created by karan patoliya
 on Jan 2020    ***/
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }

}
