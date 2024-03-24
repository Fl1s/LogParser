package commands;

import program.LogEntity;

public class GetDateCommand extends Command {
    public GetDateCommand(LogEntity logEntity) {
        this.logEntity = logEntity;
    }

    @Override
    Object execute() {
        return logEntity.getDate();
    }
}
