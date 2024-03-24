package commands;

import program.LogEntity;

public abstract class Command {
    protected LogEntity logEntity;

    public abstract Object execute();
}