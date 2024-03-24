package commands;

import program.LogEntity;

public class GetStatusCommand extends Command {
    public GetStatusCommand(LogEntity logEntity) {
        this.logEntity = logEntity;
    }

    @Override
    public Object execute() {
        return logEntity.getStatus();
    }
}