package pl.pawel.linkshell.createyourself.domain.goals.impl;

import pl.pawel.linkshell.createyourself.domain.goals.Goal;

public class StrategicGoal implements Goal {

    @Override
    public String getAction() {
        return "Chcę schudnąć";
    }

    @Override
    public String getContent() {
        return "20 kg ";
    }

    @Override
    public String getTime() {
        return "w ciągu 6 miesięcy";
    }
}
