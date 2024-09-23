public class Metodos {
    public static void main(String[] args) {
        // Métodos

        // Exemplos \\

        // somar(int n1, int n2){}

        // abrirConexao(){}

        // concluirProcessamento(){}

        // findById(int id){}

        // calcularImprimir(){} -> sentido do verbo do método está duplo(incorreto).
    

        // Estrutura de um método
        /*public class MyClass{
            public double somar(int num1, int num2){
            LOGICA - FINALIDADE DO MÉTODO
            return // finalizar
            }

            public void imprimir(String texto){
            LOGICA
            NÃO PRECISA DE RETURN (pois ele tem Void(não retorna nada))
            NÃO VAI RETORNAR RESULTADO
            }
            -> throws Exception{}
            -> indica que esse método ao ser utilizado, poderá gerar uma exceção.
        }*/
    

        // private void metodoPrivado(){}
        // -> esse método nãopode ser visto por outras classes.

        // public void validar(){
        // -> este método deveria retornar algo, porque está declarado como 'validar'   
        // -> porém está como 'Void', sendo que o mesmo não retorna nenhum valor, resultando em um equívoco estrutural.
        // -> seria booleano.
        //}

        /*
         * public void calcularEnviar(){
         * // método com mais de uma resposabilidade, e possui um 'Void'
         * }
         */

         /* public void gravarCliente(String nome, String cpf)

            nessa public, estou passando varios parâmetros no método
            porém invés de fazer isso, esse método já tem a finalidade de gravar
            posso criar um objeto cliente e passar como parâmetro  

            -> Veja Abaixo <-
          */

          // public void gravarCliente(Cliente cliente){}

          // ou

          // public void gravar(Cliente cliente){}
    }
    
}
