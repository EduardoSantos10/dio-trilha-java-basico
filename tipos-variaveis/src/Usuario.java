public class Usuario {

    // Método Main (EXecuta nossa aplicação)
    public static void main(String[] args) throws Exception {

        // int, long, string =  (iteração de métodos, a minha classe é a SmartTv)
        SmartTv smartTv = new SmartTv(); // criei uma nova classe


        // Vou chamar atributos da classe Smart Tv e concatenar com a mensagem.
        System.out.println("TV Ligada ? " +  smartTv.ligada); // comando para imprimir volume
        System.out.println("Canal Atual : " + smartTv.canal); // comando para imprimir canal
        System.out.println("Volume Atual : " + smartTv.volume); // comando para imprimir
        
        smartTv.ligar(); // chomar o método ligar
        System.out.println("Novo status -> TV Ligada ? " +  smartTv.ligada);

        smartTv.desligar(); // chomar o método desligar
        System.out.println("Novo status -> TV Ligada ? " +  smartTv.ligada);

        // Irei chamar o método para diminuir o volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume(); //esse método aumenta meu volume
        System.out.println("Volume Atual : " + smartTv.volume); // imprimir o volume atual


        System.out.println("Canal Atual : " + smartTv.canal); // estou imprimindo qual canal o usuário está

        smartTv.mudarCanal(13); // executo o método canal com o número selecionado
        System.out.println("Canal Atual : " + smartTv.canal); // chamo o método canal com a escolha do usuário


    }
    
}
