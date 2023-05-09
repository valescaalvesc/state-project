package com.example.projeto;

public class NotaEstadoSalva extends NotaEstado{

    private NotaEstadoSalva() {};
    private static NotaEstadoSalva instance = new NotaEstadoSalva();
    public static NotaEstadoSalva getInstance() {
        return instance;
    }

    public String getEstado() {return "Salva";}

    public boolean atualizar(Nota nota) {
        nota.setEstado(NotaEstadoAtualizada.getInstance());
        return true;
    }

    public boolean deletar(Nota nota) {
        nota.setEstado(NotaEstadoDeletada.getInstance());
        return true;
    }

    public boolean editar(Nota nota) {
        nota.setEstado(NotaEstadoEditada.getInstance());
        return true;
    }

    public boolean restaurar(Nota nota) {
        nota.setEstado(NotaEstadoRestaurada.getInstance());
        return true;
    }

    public boolean apagar(Nota nota) {
        nota.setEstado(NotaEstadoApagada.getInstance());
        return true;
    }
}
