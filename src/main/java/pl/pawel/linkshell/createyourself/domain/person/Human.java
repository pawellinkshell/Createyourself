package pl.pawel.linkshell.createyourself.domain.person;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.domain.Item;
import pl.pawel.linkshell.createyourself.domain.dogma.Dogma;
import pl.pawel.linkshell.createyourself.domain.lifesense.LifeSense;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
@PropertySource("classpath:/base_pl.properties")
@ConfigurationProperties(prefix = "human")
public class Human extends Item {
    private String name;
    private String surname;
    @Autowired
    private Dogma dogma;
    @Autowired
    private LifeSense lifeSense;
}