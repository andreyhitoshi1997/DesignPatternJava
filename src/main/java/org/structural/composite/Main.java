package org.structural.composite;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("relatorio.pdf");
        File file2 = new File("imagem.png");
        File file3 = new File("apresentacao.pptx");

        Directory pastaDocumentos = new Directory("Documentos");
        pastaDocumentos.add(file1);
        pastaDocumentos.add(file2);

        Directory pastaTrabalho = new Directory("Trabalho");
        pastaTrabalho.add(file3);
        pastaTrabalho.add(pastaDocumentos); // Composição

        pastaTrabalho.showDetails("");
    }
}

