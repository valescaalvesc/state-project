package com.example.projeto;

public class NotaEstadoEditada extends NotaEstado{

    private NotaEstadoEditada() {};
    private static NotaEstadoEditada instance = new NotaEstadoEditada();
    public static NotaEstadoEditada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Editada";
    }
}
