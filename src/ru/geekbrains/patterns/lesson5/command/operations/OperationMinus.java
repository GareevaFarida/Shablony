package ru.geekbrains.patterns.lesson5.command.operations;

public class OperationMinus extends Operation {

    public OperationMinus(Double init, Double delta) {
        super(init, delta);
    }

    @Override
    public Double execute() {
        result = init - delta;
        System.out.printf("Результат операции вычитания %f - %f  = %f\n", init, delta, result);
        return result;
    }
}
