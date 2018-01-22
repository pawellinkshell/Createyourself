package pl.pawel.linkshell.createyourself.model.lifesense;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import pl.pawel.linkshell.createyourself.model.Item;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
@PropertySource("classpath:base_pl.properties")
@ConfigurationProperties(prefix = "value")
public class Value extends Item {

}
