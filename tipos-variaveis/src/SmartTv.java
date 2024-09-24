public class SmartTv {
    // Atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Métodos que manipulam esses estados

    // método para o usuário mudar de canal com um parâmetro
    public void mudarCanal(int novoCanal){ // atarvés dessa declaração o usuário pode informar qual canal ele quer.

        canal = novoCanal;

    }



    public void aumentarCanal(){ // método para mudar de canal
        canal++; // método unário para aumentar/mudar de canal
    }

    public void diminuirCanal(){
        canal--;
    }

    // Void não me retorna nada
    public void ligar(){
        ligada = true; // TV está ligada
    }
    
    public void desligar(){
        ligada = false;// TV está ligada
    }


    public void aumentarVolume(){ // O método aumentarVolume foi criado
        // volume = volume + 1;
        volume++; // add um operador unário para realizar essa ação
        System.out.println("Aumentando o volume para: " + volume); // aumentando meu volume, estou imprimindo
    
    
    }


    public void diminuirVolume(){ // O método aumentarVolume foi criado
        // volume = volume - 1;
        volume--; // add um operador unário para realizar essa ação
        System.out.println("Diminuindo o volume para: " + volume);
    }



}
