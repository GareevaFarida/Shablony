package ru.geekbrains.patterns.lesson5.command.operations;

public class OperationMult extends Operation {

    public OperationMult(Double init, Double delta) {
        super(init, delta);
    }

    @Override
    public Double execute() {
        result = init * delta;
        System.out.printf("Результат операции умножения %f * %f  = %f\n", init, delta, result);
        return result;
    }
}
