package ru.geekbrains.patterns.lesson5.command;

import java.util.Stack;

public class Receiver {
    Stack<Invoker> list = new Stack<>();

    public void attach(Invoker invoker) {
        list.push(invoker);
    }

    public void undo() {
        list.pop();
    }

    public Double getResult() {
        if (list.empty()) return 0d;
        return list.peek().execute();
    }
}
