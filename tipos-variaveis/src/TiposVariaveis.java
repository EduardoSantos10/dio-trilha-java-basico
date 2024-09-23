
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.50; // Valor de Milhar em double
        // Não acrescentar ponto o significa que temos uma var em milhar
        // O ponto seria como centamos após os numeros inteiros R$ 2500.00

        // int salario = 10000.00 -> Declaração certa em double

        /*
        byte idade = 22;
        short ano = 2002;
        int cep = 97824901; // se começar com zero(0) tenha que ser outro tipo.
        // Java não atribui valor de zero(0) no 'int' somente na 'string'
        long cpf = 24456633598L; // se começat com zero(0) tenha que ser outro tipo.
        // tipo long prescisa ser encerrado com 'L', para o compilador entender como 'long'.
        float pi = 4.59F; // tipo float prescisa de 'f', 'F' no final, se não, ele vai entender como double.
        double salario = 1500.60;
        */

        short numeroCurto = 1; // atribuido valor a Var 'short'
        int numeroBasico = numeroCurto; // Var com valor 'short' atribuido a uma Var 'int'
        short numeroCurto2 = (short) numeroBasico; // tentando atribuir uma valor com 'int' e short e isso gera um erro
        // a Var que era 'int' retornou a 'short'.
        // colocarmos um modo chamado 'CASTING' -> ele pega um tipo abrangente e transforma em tipo específico.
    }
}

// Como declara uma Var

// Tipo de dados + nome da Var = Valor aturbuido
// int(tipo) idade(nome da Var); -> Quando não atribuo o valor a Var, ela será zero (0).
// int(tipo) anoFabricacao(nome da Var) = 2002(valor atribuido)
// double(tipo) salarioMinimo(nome da Var) = 2.500(valor)

// Em Java ponto(.), não significa milhar.
