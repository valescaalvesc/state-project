package com.example.projeto;

import java.util.ArrayList;
import java.util.List;
public class Nota {

private String nome;
private NotaEstado estado;

public Nota() {
        this.estado = NotaEstadoApagada.getInstance();
        }

public void setEstado(NotaEstado estado) {
        this.estado = estado;
        }

public boolean apagar() {
        return estado.apagar(this);
        }

public boolean atualizar() {
        return estado.atualizar(this);
        }

public boolean deletar() {
        return estado.deletar(this);
        }

public boolean editar() {
        return estado.editar(this);
        }

public boolean restaurar() {
        return estado.restaurar(this);
        }

public boolean salvar() {
        return estado.salvar(this);
        }

public String getNomeEstado() {
        return estado.getEstado();
        }

public String getNome() {
        return nome;
        }

public void setNome(String nome) {
        this.nome = nome;
        }

public NotaEstado getEstado() {
        return estado;
        }
}
