package pl.pawel.linkshell.createyourself.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.pawel.linkshell.createyourself.domain.person.Human;

@Repository
public class HumanDAO {

    @Autowired
    Human human;

    public Human findByName(String name) {
        if (!"".equals(name)) {
            return human;
        }
        return new Human();
    }
}
