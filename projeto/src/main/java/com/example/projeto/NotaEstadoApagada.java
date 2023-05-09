package com.example.projeto;

public class NotaEstadoApagada extends NotaEstado{

    private NotaEstadoApagada() {};
    private static NotaEstadoApagada instance = new NotaEstadoApagada();
    public static NotaEstadoApagada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Apagada";
    }


}
