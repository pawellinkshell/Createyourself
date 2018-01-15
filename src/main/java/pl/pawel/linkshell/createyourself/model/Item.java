package pl.pawel.linkshell.createyourself.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {
    private String name;
    private String description;
    private int uid;
}