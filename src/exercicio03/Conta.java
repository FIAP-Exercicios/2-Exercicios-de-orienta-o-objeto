package exercicio03;

public class Conta {

    String nome;
    int numero;
    double  saldo;

    //Método para depositar a conta

    public void Depositar(double dinheiro) {
       saldo+= dinheiro;
    }
    //Método para Sacar a conta
    public void Sacar(double dinheiro) {
        saldo-= dinheiro;
    }

}

