package com.example.projeto;

public abstract class NotaEstado {

    public abstract String getEstado();

    public boolean apagar(Nota nota) {
        return false;
    }

    public boolean atualizar(Nota nota) {
        return false;
    }

    public boolean deletar(Nota nota) {return false;}

    public boolean editar(Nota nota) {return false;}

    public boolean restaurar(Nota nota) {return false;}

    public boolean salvar(Nota nota) {return false;}
}
