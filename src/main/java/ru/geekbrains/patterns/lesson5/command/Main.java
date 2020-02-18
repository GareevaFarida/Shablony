package ru.geekbrains.patterns.lesson5.command;

import ru.geekbrains.patterns.lesson5.command.operations.Operation;
import ru.geekbrains.patterns.lesson5.command.operations.OperationDiv;
import ru.geekbrains.patterns.lesson5.command.operations.OperationPlus;

public class Main {
    public static void main(String[] args) {


        Double result = 0d;
        //операция сложения 1 + 5
        //подготовили операцию
        Operation operationPlus1 = new OperationPlus(1d,5d);

        //готовую операцию обернули в invoker
        Invoker invoker1 = new Invoker(operationPlus1);

        //создали получателя
        Receiver receiver = new Receiver();

        //передали получателю операцию через invoker
        receiver.attach(invoker1);

        //получатель выполняет операцию
        result = receiver.getResult();

        //------------------------------
        //операция сложения 6 + 10
        //подготовили операцию
        Operation operationPlus2 = new OperationPlus(result,10d);

        //готовую операцию обернули в invoker
        Invoker invoker2 = new Invoker(operationPlus2);

        //передали получателю операцию через invoker
        receiver.attach(invoker2);

        //получатель выполняет операцию
        result = receiver.getResult();

        //------------------------------
        //операция деления 16 на 4
        //подготовили операцию
        Operation operationDiv = new OperationDiv(result,4d);

        //готовую операцию обернули в invoker
        Invoker invoker3 = new Invoker(operationDiv);

        //передали получателю операцию через invoker
        receiver.attach(invoker3);

        //получатель выполняет операцию
        result = receiver.getResult();

        //получатель решил откатить изменения
        System.out.println("Откатываем одно изменение");
        receiver.undo();
        receiver.getResult();

        //получатель решил откатить второе изменения
        System.out.println("Откатываем второе изменение");
        receiver.undo();
        receiver.getResult();
    }
}
