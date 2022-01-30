package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso java","descrição curso Java",8);
        Curso curso2 = new Curso("Curso JS","descrição curso JS",4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria("Mentoria de java","descriçaõ mentoria java", LocalDate.now());

        System.out.println(mentoria1);
    }
}
