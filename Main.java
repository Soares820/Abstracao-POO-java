package main;

import service.EmprestimoService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        EmprestimoService emprestimoService = new EmprestimoService();


        System.out.print("Digite sua renda anual: ");
        double rendaAnual = scanner.nextDouble();

        System.out.print("Digite o valor do empréstimo desejado: ");
        double valorEmprestimo = scanner.nextDouble();


        boolean aprovado = emprestimoService.verificarAprovacao(rendaAnual, valorEmprestimo);


        if (aprovado) {
            System.out.println("Empréstimo Aprovado!");
        } else {
            System.out.println("Empréstimo Reprovado!");
        }


        scanner.close();
    }
}
