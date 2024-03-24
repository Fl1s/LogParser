package commands;

import program.LogEntity;

public class GetEventCommand extends Command {
    public GetEventCommand(LogEntity logEntity) {
        this.logEntity = logEntity;
    }

    @Override
    Object execute() {
        return logEntity.getEvent();
    }
}
