package pl.pawel.linkshell.createyourself.domain.lifesense;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.domain.lifesense.part.Mission;
import pl.pawel.linkshell.createyourself.domain.lifesense.part.Value;
import pl.pawel.linkshell.createyourself.domain.lifesense.part.Vision;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Component
@PropertySource("classpath:/base_pl.properties")
@ConfigurationProperties(prefix = "life-sense")
public class LifeSense {
    @Autowired
    private Vision vision;
    @Autowired
    private Mission mission;
    private List<Value> value;
}
