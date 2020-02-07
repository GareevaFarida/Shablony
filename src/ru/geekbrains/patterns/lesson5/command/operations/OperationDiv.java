package ru.geekbrains.patterns.lesson5.command.operations;

public class OperationDiv extends Operation {

    public OperationDiv(Double init, Double delta) {
        super(init, delta);
    }

    @Override
    public Double execute() {
        if (delta == 0d) throw new RuntimeException("Ошибка! На нуль делить нельзя!");
        result = init / delta;
        System.out.printf("Результат операции деления %f / %f  = %f\n", init, delta, result);
        return result;
    }
}
