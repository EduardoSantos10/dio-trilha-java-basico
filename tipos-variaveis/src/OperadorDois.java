public class OperadorDois {
    public static void main(String[] args) {
        // Ternário
        // int a, b; //tenho duas variavés

        // a = 10; // faço a atribuição de valores
        // b = 20;

        /*String resultado = ""; // declaro o tipo da variavél que vai trazer o resultado.

        // Estrutura de repetição com IF
        if(a==b) // avaliar se A é igual B
            resultado = "verdadeiro";
        
        else    // se for é 'verdadeiro', se não, ele é 'falso'
            resultado = "falso";
        System.out.println(resultado); // imprimindo o resultado do loop.*/

        // Realizando uma operação ternária com os sinais '?' e ":"
        // String resultado = a==b ? "verdadeiro" : "falso"; // operação ternário
        // System.out.println(resultado);


        // Relacionais
        /*
         * == (Verificar se uma Var é igual a outra )
         * != (Verifica se uma Var é diferente da outra)
         * > (Verifica se Var é maior que a outra)
         * < (Verifica se uma Var é menor que a outra)
         * >= (Verifica se uma Var é maior ou igual a outra)
         * <= (Verifica se uma Var é menor ou igual a outra)
         */

         // declaro o tipo das minhas Var, nomeio, e atribuo um valor.
         // int numero1 = 10;
         // int numero2 = 20;

         // utilizo os operadores relacionais conforme a minha pergunta e no decorrer do sistema.
         /*boolean simNao = numero1 == numero2;
         System.out.println("NUmero 1 é maior que número 2?\n" + simNao);

         simNao = numero1 != numero2;
         System.out.println("Número 1 é diferente de número 2?\n" + simNao);

         simNao = numero1 > numero2;
         System.out.println("Número 1 é maior que o número 2?\n" + simNao);

         simNao = numero1 < numero2;
         System.out.println("Número 1 é maior que o número 2?\n" + simNao);

         simNao = numero1 >= numero2;
         System.out.println("Número 1 é maior que o número 2?\n" + simNao);
        */
        
        /*if(numero1 < numero2)
    {
        System.out.println("A nossa condição é verdadeira!");
    }*/

        // Op. Relacionais com strings
        /*String nomeUm = "EDUARDO";
        String nomeDois = new String("EDUARDO"); // criando uma nova string (objeto).

        System.out.println(nomeUm.equals(nomeDois)); // ele compara se o valor da Var são iguais. Ele compara conteúdos.
        */
        

        // Op, Lógicos

        // declarro e atribuo valor a duas Var booleanas
        boolean condicao1 = true;
        boolean condicao2 = true;

        // porém eu não precisa só usar expressões booleanas, posso ver express. relacionais.


        // faço uma condição com IF para avaliar se essas Var são verdadairas ou falsas.
        if(condicao1 && (10 > 5)){ // uso o op lóg. 'E'
            System.out.println("as duas condições são verdadeiras!");
        } // validas se ambas condições são verdadaieras(falsas)

        if(condicao1 || condicao2){ // uso o Op. Lóg. 'OU'
            System.out.println("uma das condições são verdadeiras!");
        } // '||' valida se uma das condições são verdadeiras(falsas)

        System.out.println("Fim");






    }
}
