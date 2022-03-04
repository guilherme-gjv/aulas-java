public class Ventilador {
    // atributos do ventilador:
    String marca;
    float preco;
    String tipo;
    int numeroDePas;
    float diametro;
    int numeroDeVelocidades;
    boolean estaLigado = false;
    boolean estaGirando;

    Ventilador(String m, float p, String t, int nDP, float d, int nDV, boolean estaLgd, boolean estaGrnd) {
        marca = m;
        preco = p;
        tipo = t;
        numeroDePas = nDP;
        diametro = d;
        numeroDeVelocidades = nDV;
        estaLigado = estaLgd;
        estaGirando = estaGrnd;
    }

    void exibirInformacoes() {
        System.out.println("A marca do ventilador é " + marca);
        System.out.println("O preço do ventilador é " + preco);
        System.out.println("O tipo do ventilador é " + tipo);
        System.out.println("O diâmetro do ventilador é " + diametro);
        System.out.println("O numero de pás do ventilador é " + numeroDePas);
        System.out.println("O numero de velocidades do ventilador é " + numeroDeVelocidades);
        System.out.println("O ventilador está ligado? " + estaLigado);
        System.out.println("O ventilador está girando? " + estaGirando);
    }

    // Essa função inverte o modo do ventilador:
    // se ele está desligado, ele liga e vice-versa;
    void ligarOuDesligar() {
        if (estaLigado == false) {
            System.out.println("\nLigando Ventilador...\n");
            estaLigado = true;
        } else {
            System.out.println("\nDesligando Ventilador...\n");
            estaLigado = false;
        }
    }

}
