package model;

import java.io.Serializable;
import java.util.Objects;

public class Obra implements Serializable {

    private String titulo;
    private String anoLancamento;
    private String categoria;

    public Obra(String titulo, String anoLancamento, String categoria) {
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

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        if (anoLancamento.equals("0")) {
            throw new IllegalArgumentException("O ano de lançamento não pode ser zero!");
        }
        this.anoLancamento = anoLancamento;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }
}
