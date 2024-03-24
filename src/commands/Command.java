package commands;

import program.LogEntity;

public abstract class Command {
    protected LogEntity logEntity;

    abstract Object execute();
}