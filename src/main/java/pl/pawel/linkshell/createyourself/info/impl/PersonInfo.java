package pl.pawel.linkshell.createyourself.info.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.domain.person.Human;
import pl.pawel.linkshell.createyourself.info.Info;

import javax.annotation.PostConstruct;

@Component
public class PersonInfo implements Info {
    @Autowired(required = false)
    private Human human;

    @PostConstruct
    public void init() {
        isBeanExists(human);
    }

}
