package exercicio01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta= new Conta();
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();

        System.out.println("Qual seu nome?");
        conta.nome=sc.nextLine();
        conta.numero= rd.nextInt(10, 10000);
        System.out.println(conta.saldo);
        conta.Depositar(10000);

        System.out.println(conta.saldo);
        conta.Sacar(5500);
        System.out.println(conta.saldo);


    }
}
