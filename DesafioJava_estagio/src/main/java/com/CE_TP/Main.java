package com.CE_TP;

public class Main {

//    Desafio: Descubra a Árvore Genealógica da sua Família!
//
//    Você deseja descobrir o nome do seu tataravô, mas atualmente conhece apenas o nome do seu pai. Seu pai, por sua vez,
//    conhece o nome do pai dele, e assim sucessivamente.
//    Crie uma implementação que faça perguntas sucessivas a cada pessoa da família, até que não exista mais ninguém para informar.
//
//            Requisitos:
//            - Cada pessoa tem apenas um nome e sabe quem é seu pai.
//            - Criar uma massa de teste para simular o cenário descrito.
//            - Não utilizar estruturas de dados pré-existentes como List, ArrayList, etc.
//- O código deve permitir informar qual nível hierárquico deseja obter.
//            - Não deve ser lido nada do input do usuário, a massa de dados deve ser criada fixo.
//            - A estrutura/algoritmo criado não deve ser fixo para, apenas o nível hierárquico
//        “tataravô > avô > pai > filho > neto”.
//    Deve funcionar para uma árvore maior ou menor, o algoritmo não é fixo somente a massa de dados.

    public static void main(String[] args) {

        Familia familia = new Familia();

        Pessoa p1 = new Pessoa("Jose ferreira", "Jose Andrade");
        Pessoa p2 = new Pessoa("Jose Andrade", "Joao da silva");
        Pessoa p3 = new Pessoa("Joao da silva", "Joaquim nascimento");
        Pessoa p4 = new Pessoa("Joaquim nascimento", "Joao Pereira");
        Pessoa p5 = new Pessoa("Joao Pereira", "Arthur silva");
        Pessoa p6 = new Pessoa("Arthur silva", "Heitor gomes");
        Pessoa p7 = new Pessoa("Heitor gomes", "Guilherme Campos");
        Pessoa p8 = new Pessoa("Guilherme Campos", "Julio Gomes");

        familia.adicionaPessoa(p1);
        familia.adicionaPessoa(p2);
        familia.adicionaPessoa(p3);
        familia.adicionaPessoa(p4);
        familia.adicionaPessoa(p5);
        familia.adicionaPessoa(p6);
        familia.adicionaPessoa(p7);
        familia.adicionaPessoa(p8);

        System.out.println(familia.getNomeFamiliar(p1,GrauFamiliar.AVO));
        System.out.println(familia.getNomeFamiliar(p1,GrauFamiliar.TATARAVO));

        System.out.println();

        System.out.println(familia.getNomeFamiliar(p2,GrauFamiliar.AVO));
        System.out.println(familia.getNomeFamiliar(p2,GrauFamiliar.TATARAVO));

        System.out.println();

        System.out.println(familia.getNomeFamiliar(p3,GrauFamiliar.AVO));
        System.out.println(familia.getNomeFamiliar(p3,GrauFamiliar.TATARAVO));

        System.out.println();

        System.out.println(familia.getNomeFamiliar(p4,GrauFamiliar.AVO));
        System.out.println(familia.getNomeFamiliar(p4,GrauFamiliar.TATARAVO));

        System.out.println();

        System.out.println(familia.getNomeFamiliar(p5,GrauFamiliar.AVO));
        System.out.println(familia.getNomeFamiliar(p5,GrauFamiliar.TATARAVO));



    }
}