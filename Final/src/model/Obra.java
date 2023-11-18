package model;

import java.io.Serializable;
import java.util.Objects;

public class Obra implements Serializable {

    private String titulo;
    private int anoLancamento;
    private Categoria categoria;

    public Obra(String titulo, int anoLancamento, Categoria categoria) {
        setAnoLancamento(anoLancamento);
        setTitulo(titulo);
        setCategoria(categoria);
    }

    public Obra() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        Objects.requireNonNull(titulo, "O título não pode ser nulo!");
        if (titulo.isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser vazio!");
        }
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento == 0) {
            throw new IllegalArgumentException("O ano de lançamento não pode ser zero!");
        }
        this.anoLancamento = anoLancamento;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria.name();
    }
}
