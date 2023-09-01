public class usuario {
    public static void main(String[] args) throws Exception {
        smarTV smarTV = new smarTV();

        smarTV.escolherCanal(28);

        smarTV.aumentarVolume();
        smarTV.aumentarVolume();
        smarTV.aumentarVolume();
        smarTV.aumentarVolume();
        smarTV.diminuirVolume();

        System.out.println(smarTV.tvLigada);
        System.out.println(smarTV.canal);
        System.out.println(smarTV.volume);


        smarTV.ligar();
        System.out.println(smarTV.tvLigada);

        smarTV.desligar();
        System.out.println(smarTV.tvLigada);
    }
}
