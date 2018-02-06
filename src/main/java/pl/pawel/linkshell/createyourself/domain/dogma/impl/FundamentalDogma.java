package pl.pawel.linkshell.createyourself.domain.dogma.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.domain.Item;
import pl.pawel.linkshell.createyourself.domain.dogma.Dogma;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
@PropertySource("classpath:base_pl.properties")
@ConfigurationProperties(prefix = "dogma")
public class FundamentalDogma extends Item implements Dogma {
    private String responsibility;
    private String faith;
    private String strategy;
    private String tactic;
    private String action;
    private String feedback;
    private String concentration;
    private String consequence;

}
