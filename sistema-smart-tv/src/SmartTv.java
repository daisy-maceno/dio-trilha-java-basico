public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public void mudarCanal (int novoCanaL){
        canal = novoCanaL;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando o Volume para: " + volume);
        //volume = volume + 1;
        volume++;
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o Volume para: " + volume);
        //volume = volume - 1;
        volume --;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
       ligada = false;
    }
}
