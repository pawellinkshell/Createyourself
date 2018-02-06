package pl.pawel.linkshell.createyourself.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.pawel.linkshell.createyourself.domain.person.Human;
import pl.pawel.linkshell.createyourself.service.HumanService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class HumanRestController {

    @Autowired
    private HumanService humanService;

    @GetMapping(path = "/get/json/human}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getJSON() {
        Human human = humanService.getHuman("Jan");
        List<String> list = new ArrayList<>();
        list.add(human.getName());
        list.add(human.getSurname());
        list.add(human.getDogma().toString());
        return ResponseEntity
                .ok()
                .cacheControl(CacheControl.noCache())
                .body(list);
    }
}

