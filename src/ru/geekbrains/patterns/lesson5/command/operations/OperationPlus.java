package ru.geekbrains.patterns.lesson5.command.operations;

public class OperationPlus extends Operation {

    public OperationPlus(Double init, Double delta) {
        super(init, delta);
    }

    @Override
    public Double execute() {
        result = init + delta;
        System.out.printf("Результат операции сложения %f + %f  = %f\n", init, delta, result);
        return result;
    }
}
