package org.structural.Proxy;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String fileName;
    private boolean hasPermission;

    public DocumentProxy(String fileName, boolean hasPermission) {
        this.fileName = fileName;
        this.hasPermission = hasPermission;
    }

    @Override
    public void display() {
        if (!hasPermission) {
            System.out.println("Acesso negado ao documento: " + fileName);
            return;
        }

        if (realDocument == null) {
            realDocument = new RealDocument(fileName); // lazy load
        }

        realDocument.display();
    }
}

