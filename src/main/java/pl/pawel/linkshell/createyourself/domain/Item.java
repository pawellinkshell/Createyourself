package pl.pawel.linkshell.createyourself.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {
    private String uid;
    private String name;
    private String description;
}
