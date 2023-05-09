package com.example.projeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NotaTest {

    Nota nota;

    @BeforeEach
    public void setUp() {
        nota = new Nota();
    }

    // Nota Salva

    @Test
    public void naoDeveSalvarNotaSalva() {
        nota.setEstado(NotaEstadoSalva.getInstance());
        assertFalse(nota.salvar());
    }

    @Test
    public void deveApagarNotaSalva() {
        nota.setEstado(NotaEstadoSalva.getInstance());
        assertTrue(nota.apagar());
        assertEquals(NotaEstadoApagada.getInstance(), nota.getEstado());
    }

    @Test
    public void deveAtualizarNotaSalva() {
        nota.setEstado(NotaEstadoSalva.getInstance());
        assertTrue(nota.atualizar());
        assertEquals(NotaEstadoAtualizada.getInstance(), nota.getEstado());
    }

    @Test
    public void deveDeletarNotaSalva() {
        nota.setEstado(NotaEstadoSalva.getInstance());
        assertTrue(nota.deletar());
        assertEquals(NotaEstadoDeletada.getInstance(), nota.getEstado());
    }

    @Test
    public void deveEditarNotaSalva() {
        nota.setEstado(NotaEstadoSalva.getInstance());
        assertTrue(nota.editar());
        assertEquals(NotaEstadoEditada.getInstance(), nota.getEstado());
    }

    @Test
    public void deveRestaurarNotaSalva() {
        nota.setEstado(NotaEstadoSalva.getInstance());
        assertTrue(nota.restaurar());
        assertEquals(NotaEstadoRestaurada.getInstance(), nota.getEstado());
    }

    // Nota Atualizada

    @Test
    public void deveSalvarNotaAtualizada() {
        nota.setEstado(NotaEstadoAtualizada.getInstance());
        assertTrue(nota.salvar());
        assertEquals(NotaEstadoSalva.getInstance(), nota.getEstado());
    }

    @Test
    public void naoDeveApagarNotaAtualizada() {
        nota.setEstado(NotaEstadoAtualizada.getInstance());
        assertFalse(nota.apagar());
    }

    @Test
    public void naoDeveRestaurarNotaAtualizada() {
        nota.setEstado(NotaEstadoAtualizada.getInstance());
        assertFalse(nota.restaurar());
    }

    @Test
    public void deveApagarNotaAtualizada() {
        nota.setEstado(NotaEstadoAtualizada.getInstance());
        assertTrue(nota.apagar());
        assertEquals(NotaEstadoApagada.getInstance(), nota.getEstado());
    }

    @Test
    public void deveEditarNotaAtualizada() {
        nota.setEstado(NotaEstadoAtualizada.getInstance());
        assertTrue(nota.editar());
        assertEquals(NotaEstadoEditada.getInstance(), nota.getEstado());
    }

    @Test
    public void naoDeveDeletarNotaAtualizada() {
        nota.setEstado(NotaEstadoAtualizada.getInstance());
        assertFalse(nota.deletar());
    }

    // Nota Deletada

    @Test
    public void naoDeveApagarNotaDeletada() {
        nota.setEstado(NotaEstadoDeletada.getInstance());
        assertFalse(nota.apagar());
    }

    @Test
    public void naoDeveAtualizarNotaDeletada() {
        nota.setEstado(NotaEstadoDeletada.getInstance());
        assertFalse(nota.atualizar());
    }

    @Test
    public void naoDeveEditarNotaDeletada() {
        nota.setEstado(NotaEstadoDeletada.getInstance());
        assertFalse(nota.editar());
    }

    @Test
    public void naoDeveRestaurarNotaDeletada() {
        nota.setEstado(NotaEstadoDeletada.getInstance());
        assertFalse(nota.restaurar());
    }

    @Test
    public void naoDeveSalvarNotaDeletada() {
        nota.setEstado(NotaEstadoDeletada.getInstance());
        assertFalse(nota.salvar());
    }

    @Test
    public void naoDeveDeletarNotaDeletada() {
        nota.setEstado(NotaEstadoDeletada.getInstance());
        assertFalse(nota.deletar());
    }

    // Nota editada

    @Test
    public void naoDeveApagarNotaEditada() {
        nota.setEstado(NotaEstadoEditada.getInstance());
        assertFalse(nota.apagar());
    }

    @Test
    public void naoDeveAtualizarNotaEditada() {
        nota.setEstado(NotaEstadoEditada.getInstance());
        assertFalse(nota.atualizar());
    }

    @Test
    public void naoDeveDeletarNotaEditada() {
        nota.setEstado(NotaEstadoEditada.getInstance());
        assertFalse(nota.deletar());
    }

    @Test
    public void naoDeveRestaurarNotaEditada() {
        nota.setEstado(NotaEstadoEditada.getInstance());
        assertFalse(nota.restaurar());
    }

    @Test
    public void naoDeveSalvarNotaSalva() {
        nota.setEstado(NotaEstadoEditada.getInstance());
        assertFalse(nota.salvar());
    }

    @Test
    public void naoDeveEditarNotaEditada() {
        nota.setEstado(NotaEstadoEditada.getInstance());
        assertFalse(nota.editar());
    }

    // Nota restaurada

    @Test
    public void naoDeveApagarNotaRestaurada() {
        nota.setEstado(NotaEstadoRestaurada.getInstance());
        assertFalse(nota.apagar());
    }

    @Test
    public void naoDeveAtualizarNotaRestaurada() {
        nota.setEstado(NotaEstadoRestaurada.getInstance());
        assertFalse(nota.atualizar());
    }

    @Test
    public void naoDeveDeletarNotaRestaurada() {
        nota.setEstado(NotaEstadoRestaurada.getInstance());
        assertFalse(nota.deletar());
    }

    @Test
    public void deveSalvarNotaRestaurada() {
        nota.setEstado(NotaEstadoRestaurada.getInstance());
        assertTrue(nota.salvar());
        assertEquals(NotaEstadoSalva.getInstance(), nota.getEstado());
    }

    @Test
    public void naoDeveEditarNotaRestaurada() {
        nota.setEstado(NotaEstadoRestaurada.getInstance());
        assertFalse(nota.editar());
    }

    @Test
    public void naoDeveRestaurarNotaRestaurada() {
        nota.setEstado(NotaEstadoRestaurada.getInstance());
        assertFalse(nota.restaurar());
    }

    // Nota Apagada

    @Test
    public void naoDeveAtualizarNotaApagada() {
        nota.setEstado(NotaEstadoApagada.getInstance());
        assertFalse(nota.atualizar());
    }

    @Test
    public void naoDeveDeletarNotaApagada() {
        nota.setEstado(NotaEstadoApagada.getInstance());
        assertFalse(nota.deletar());
    }

    @Test
    public void naoDeveEditarNotaApagada() {
        nota.setEstado(NotaEstadoApagada.getInstance());
        assertFalse(nota.editar());
    }

    @Test
    public void naoDeveRestaurarNotaApagada() {
        nota.setEstado(NotaEstadoApagada.getInstance());
        assertFalse(nota.restaurar());
    }

    @Test
    public void naoDeveSalvarNotaApagada() {
        nota.setEstado(NotaEstadoApagada.getInstance());
        assertFalse(nota.salvar());
    }

    @Test
    public void naoDeveApagarNotaApagada() {
        nota.setEstado(NotaEstadoApagada.getInstance());
        assertFalse(nota.apagar());
    }

}
