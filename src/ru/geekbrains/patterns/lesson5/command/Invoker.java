package ru.geekbrains.patterns.lesson5.command;

import ru.geekbrains.patterns.lesson5.command.operations.Operation;

public class Invoker {
    public Operation operation;

    public Invoker(Operation operation) {
        this.operation = operation;
    }

    public Double execute(){
        return operation.execute();
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
