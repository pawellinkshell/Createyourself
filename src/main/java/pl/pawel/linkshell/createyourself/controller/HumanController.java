package pl.pawel.linkshell.createyourself.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.pawel.linkshell.createyourself.domain.person.Human;
import pl.pawel.linkshell.createyourself.service.HumanService;

@Controller
public class HumanController {

    @Autowired
    private HumanService humanService;

    @RequestMapping(value = "/human", method = RequestMethod.GET)
    public ModelAndView showHumanPage(ModelMap map) {
        Human human = humanService.getHuman("Jan");
        map.addAttribute("human", human);
        return new ModelAndView("human");
    }


}
