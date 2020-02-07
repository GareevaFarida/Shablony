package ru.geekbrains.patterns.lesson5.command.operations;

public abstract class Operation {

    Double init;
    Double result;
    Double delta;

    public Operation(Double init, Double delta) {
        this.init = init;
        this.delta = delta;
        this.result = 0d;
    }

    public abstract Double execute();

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double delta) {
        this.delta = delta;
    }

    public Double getInit() {
        return init;
    }

    public void setInit(Double init) {
        this.init = init;
    }

}
