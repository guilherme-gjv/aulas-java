public class VentiladorMain {
    public static void main(String[] args) {
        Ventilador ventilador1;
        Ventilador ventilador2;

        ventilador1 = new Ventilador("Mondial", 70, "teto", 4, 30, 3, false, false);
        ventilador2 = new Ventilador("Britannia", 150, "chão", 6, 40, 4, false, false);
        /*
         * if (ventilador1.preco < 200 && ventilador1.numeroDePas == 4) {
         * ventilador1.exibirInformacoes();
         * }
         * if (ventilador2.preco < 200 && ventilador2.numeroDePas == 4) {
         * ventilador2.exibirInformacoes();
         * }
         * 
         */
        ventilador1.exibirInformacoes();
        ventilador1.ligarOuDesligar();
        ventilador1.exibirInformacoes();
        ventilador1.ligarOuDesligar();
        ventilador1.exibirInformacoes();

        float somaDosPrecos;
        somaDosPrecos = ventilador1.preco + ventilador2.preco;
        System.out.println("\n soma dos preços dos ventiladores " + ventilador1.marca + " e do " + ventilador2.marca
                + " é de " + somaDosPrecos);
    }

}
