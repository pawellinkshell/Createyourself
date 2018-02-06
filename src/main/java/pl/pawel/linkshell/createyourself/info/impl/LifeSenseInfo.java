package pl.pawel.linkshell.createyourself.info.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.domain.dogma.impl.FundamentalDogma;
import pl.pawel.linkshell.createyourself.domain.lifesense.part.Mission;
import pl.pawel.linkshell.createyourself.domain.lifesense.part.Value;
import pl.pawel.linkshell.createyourself.domain.lifesense.part.Vision;
import pl.pawel.linkshell.createyourself.info.Info;

import javax.annotation.PostConstruct;

@Component
public class LifeSenseInfo implements Info {
    @Autowired(required = false)
    private FundamentalDogma fundamentalDogma;
    @Autowired(required = false)
    private Vision vision;
    @Autowired(required = false)
    private Mission mission;
    @Autowired(required = false)
    private Value value;

    @PostConstruct
    public void init() {
        isBeanExists(fundamentalDogma);
        isBeanExists(vision);
        isBeanExists(mission);
        isBeanExists(value);
    }

}
