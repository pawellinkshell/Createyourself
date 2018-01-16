package pl.pawel.linkshell.createyourself.model.lifesense;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.model.Item;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Component
@PropertySource("classpath:base_pl.properties")
@ConfigurationProperties(prefix = "life-sense")
public class LifeSense extends Item {
    private Vision vision;
    private Mission mission;
    private List<Value> value;

}
