package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        Bootcamp bootcamp = new Bootcamp("Java Developer","descricao java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev("Leo");
        dev1.InscreverBootcamp(bootcamp);
        System.out.println(dev1.getNome()+":\nConteudos inscritos: "+dev1.getConteudosIncritos());
        dev1.progredir();
        System.out.println(dev1.getNome()+"\nConteudos Concluidos: "+dev1.getConteudosConcluidos());
        System.out.println("O Dev: "+ dev1.getNome()+ " possui " + dev1.calcularTotalXP() + " XP");

        System.out.println("----------------------------------------------------------------------");
        Dev dev2 = new Dev("Camila");
        dev2.InscreverBootcamp(bootcamp);
        System.out.println("\nConteudos inscritos: "+dev2.getConteudosIncritos());
        System.out.println("\nConteudos Concluidos: "+dev2.getConteudosConcluidos());
        System.out.println("Dev: "+ dev2.getNome()+ " XP: " + dev2.calcularTotalXP());

    }
}
