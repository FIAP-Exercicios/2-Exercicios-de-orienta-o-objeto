package exercicio03;

public class Professores {
    String nome;
    int totalAulas;
    double valorDaAula;

    public double calcularSalario(){
        double salarioBase;
        double horaAtividade;
        double descansoSemanal;

        salarioBase = totalAulas * valorDaAula * 4.5;
        horaAtividade= salarioBase * 0.05;
        descansoSemanal= (salarioBase + horaAtividade) / 6;

        return salarioBase + horaAtividade + descansoSemanal;

    }

}
