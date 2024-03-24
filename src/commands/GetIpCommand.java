package commands;

import program.LogEntity;

public class GetIpCommand extends Command {
    public GetIpCommand(LogEntity logEntity) {
        this.logEntity = logEntity;
    }

    @Override
    public Object execute() {
        return logEntity.getIp();
    }
}
