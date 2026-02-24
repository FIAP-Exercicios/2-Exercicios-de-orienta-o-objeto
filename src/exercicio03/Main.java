package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professores professores= new Professores();
        Scanner sc= new Scanner(System.in);

        System.out.println("Me diga seu nome--> ");
        professores.nome=sc.next();
        System.out.println("Total de aulas semanais--> ");
        professores.totalAulas= sc.nextInt();
        System.out.println("Valor por hora--> ");
        professores.valorDaAula=sc.nextInt();

        System.out.println(professores.nome);
        System.out.println("Seu sálario R$ "+professores.calcularSalario());
    }
}
