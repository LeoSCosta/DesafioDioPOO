package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.data = data;
    }

    public Mentoria() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}

