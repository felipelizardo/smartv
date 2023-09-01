public class smarTV {
    boolean tvLigada=false;
    int volume = 25;
    int canal = 1;

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarcanal() {
        canal++;
    }

    public void diminuircanal() {
        canal--;
    }


    public void aumentarVolume() {
         volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
        tvLigada = true;
    }

    public void desligar() {
        tvLigada = false;
    }
}
