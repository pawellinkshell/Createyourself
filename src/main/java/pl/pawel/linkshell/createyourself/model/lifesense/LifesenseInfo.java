package pl.pawel.linkshell.createyourself.model.lifesense;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.model.Item;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class LifesenseInfo {
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

    private void isBeanExists(Item item) {
        if (null == item) {
            log.info("Bean " + item.getClass().getName() + "is not exists");
        } else {
            log.info(item.toString());
        }
    }
}
