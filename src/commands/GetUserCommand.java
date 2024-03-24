package commands;

import program.LogEntity;

public class GetUserCommand extends Command {
    public GetUserCommand(LogEntity logEntity) {
        this.logEntity = logEntity;
    }

    @Override
    Object execute() {
        return logEntity.getUser();
    }
}
