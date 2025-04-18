package org.creation.prototype;

public class Document implements DocumentPrototype {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Clone superficial (shallow copy)
    @Override
    public DocumentPrototype clone() {
        return new Document(this.title, this.content);
    }

    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }

    public void print() {
        System.out.println("Título: " + title);
        System.out.println("Conteúdo: " + content);
        System.out.println("----------------------");
    }
}

