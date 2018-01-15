package pl.pawel.linkshell.createyourself.model.lifesense;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.pawel.linkshell.createyourself.model.Item;

import java.util.List;

@Data
@AllArgsConstructor
public class LifeSense extends Item {
    private Vision vision;
    private Mission mission;
    private List<Value> value;

}
