public class Conta { // Classe
    double saldo = 50.00; // Var da minha classe 'conta'

    // 'saldo' é Var de escopo global
    
    // public void não vai me retornar nada
    public void sacar (Double valor){ // método com parâmetro 'valor'
        double novoSaldo = saldo - valor;
        // novoSaldo e saldo só pode ser executada no escopo

        // 'valor' e novoSaldo se torna Variavéis de escopo local
        // só pode ser visivel dentro do método
    }

    public void imprimirSaldo(){ // criei o método 'imprimirSaldo'
        // A Var saldo foi declarada fora de um escopo local(método), então eu posso utilizar em todo meu programa.
        System.out.println(saldo);

        // A var novoSaldo foi declarado dentro de um escopo local, entãp apenas o método "sacar" pode utilizar ele.
        System.out.println(novoSaldo);
    }
}
