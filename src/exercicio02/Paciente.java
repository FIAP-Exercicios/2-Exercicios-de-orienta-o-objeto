package exercicio02;

public class Paciente {
    String nome;
    int idade;

    //METODO PARA MOSTRAR A FREQUENCIA MÁXIMA DO PACIENTE
    public int Frequencia(){
        return 220-idade;

    }

    //METODO PARA FREQUENCIA RECOMENDADA PARA O PACIENTE
    public double[] Alvo(){
        double[] alvo= new double[2];
        int max= Frequencia();
        alvo[0]= max * 0.5;
        alvo[1]= max * 0.85;

        return alvo;

    }

}

