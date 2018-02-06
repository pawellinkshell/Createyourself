package pl.pawel.linkshell.createyourself.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pawel.linkshell.createyourself.domain.person.Human;
import pl.pawel.linkshell.createyourself.repository.HumanDAO;

@Service
public class HumanService {

    @Autowired
    private HumanDAO humanDAO;

    public Human getHuman(final String name) {
        return humanDAO.findByName(name);
    }
}

