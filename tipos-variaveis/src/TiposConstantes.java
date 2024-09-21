public class TiposConstantes {
    public static void main(String[] args) {
        // Constantes
        /* São valores armazenado na memória que nãopodem ser modificados,
         * depois de declarados. Em JAVA, esse valores são represenatdos pela palavra reservada 'FINAL'.
         */
        int numero = 5; // declaro uma Var e seu tipo e depois atribuo um valor

            numero = 20; // Modifico seu valor no meio do programa

        System.out.println(numero); // Vou imprimir o resultado.

        final double VALOR_DE_PI = 3.14; // Declaração de uma Constante que o valor não pode ser alterado.
        // Antes de ser declarado, ela precisa da palavra reservada, 'FINAL'.  

        // VALOR_DE_PI = 10.75; -> tentaiva de alteração de valor.

    }

    
}
