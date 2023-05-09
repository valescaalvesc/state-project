package com.example.projeto;

public class NotaEstadoAtualizada extends NotaEstado{

    private NotaEstadoAtualizada() {};
    private static NotaEstadoAtualizada instance = new NotaEstadoAtualizada();
    public static NotaEstadoAtualizada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atualizada";
    }

    public boolean apagar(Nota nota) {
        nota.setEstado(NotaEstadoApagada.getInstance());
        return true;
    }

    public boolean editar(Nota nota) {
        nota.setEstado(NotaEstadoEditada.getInstance());
        return true;
    }

    public boolean salvar(Nota nota) {
        nota.setEstado(NotaEstadoSalva.getInstance());
        return true;
    }
}
