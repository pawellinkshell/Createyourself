package pl.pawel.linkshell.createyourself.domain.lifesense.part;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.domain.Item;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
@PropertySource("classpath:/base_pl.properties")
@ConfigurationProperties(prefix = "vision")
public class Vision extends Item {
    private String ideaForPerfectLife;
    private boolean inspirative;
    private boolean aspirative;
    private boolean globalCategoryThing;
    private boolean reflectToBeSenseOfLife;
}
