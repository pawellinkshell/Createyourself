package pl.pawel.linkshell.createyourself.info;

import pl.pawel.linkshell.createyourself.domain.Item;


public interface Info {
    default void isBeanExists(Item item) {
        if (null == item) {
            org.slf4j.LoggerFactory.getLogger(Info.class).info("Bean " + item.getClass().getName() + "is not exists");
        } else {
            org.slf4j.LoggerFactory.getLogger(Info.class).info(item.toString());
        }
    }
}
