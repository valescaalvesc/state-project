package com.example.projeto;

public class NotaEstadoRestaurada extends NotaEstado{

    private NotaEstadoRestaurada() {};
    private static NotaEstadoRestaurada instance = new NotaEstadoRestaurada();
    public static NotaEstadoRestaurada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Restaurada";
    }

    public boolean salvar(Nota nota) {
        nota.setEstado(NotaEstadoSalva.getInstance());
        return true;
    }
}
