package com.example.projeto;

public class NotaEstadoDeletada extends NotaEstado{

    private NotaEstadoDeletada() {};
    private static NotaEstadoDeletada instance = new NotaEstadoDeletada();
    public static NotaEstadoDeletada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Deletada";
    }
}
