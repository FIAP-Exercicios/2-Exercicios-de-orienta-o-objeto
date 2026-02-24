package exercicio02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Paciente paciente= new Paciente();
         Scanner sc= new Scanner(System.in);
         double[] alvo;

        System.out.println("Qual o seu nome? ");
        paciente.nome=sc.next();

        System.out.println("Me informe a sua idade--> ");
        paciente.idade=sc.nextInt();

        System.out.println("PACIENTE--> "+paciente.nome);
        System.out.println("Frequencia máxima--> "+paciente.Frequencia());
        alvo= paciente.Alvo();
        System.out.println();
        System.out.println("Frequencia recomendada para o paciente:" + "\n50%--> "+ alvo[0] + "\n85%--> "+ alvo[1]);

    }
}
