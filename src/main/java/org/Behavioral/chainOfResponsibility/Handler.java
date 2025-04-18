package org.Behavioral.chainOfResponsibility;

public abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);
}

