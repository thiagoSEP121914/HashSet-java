package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> alunoA = new HashSet<>();
        Set<Integer> alunoB = new HashSet<>();
        Set<Integer> alunoC = new HashSet<>();

        System.out.print("Quanto alunos no curso A? :");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            int id = sc.nextInt();
            alunoA.add(id);
        }

        System.out.print("Quantos alunos no curso B?: ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            int id = sc.nextInt();
            alunoB.add(id);
        }

        System.out.print("Quantos alunos no curso c?: ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            int id = sc.nextInt();
            alunoC.add(id);
        }

        Set<Integer> totaAluno = new HashSet<>(alunoA);
        totaAluno.addAll(alunoB);
        totaAluno.addAll(alunoC);

        System.out.println("Total Students: " + totaAluno.size());

        sc.close();
    }
}