import java.util.Scanner;

public class Pessoa {

    private Scanner leitor = new Scanner(System.in);
    private String nome;
    private int senhaDoCartao;
    private float[] notas = new float[4];
    private float media;

    public Pessoa() {
        System.out.println("Digite seu nome");
        this.nome = leitor.nextLine();
        System.out.println("Crie a senha do cartão");
        this.senhaDoCartao = leitor.nextInt();

        System.out.println("Digite a nota do ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println((i + 1) + "º bimestre");
            this.notas[i] = leitor.nextFloat();
        }

        this.media = calcularMedia();
    }

    // Sobrecarga (Overload)
    public Pessoa(String nome, int senhaDoCartao, float[] notas) {
        this.nome = nome;
        this.senhaDoCartao = senhaDoCartao;
        this.notas = notas;
    }

    private float calcularMedia() {
        float calcMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            calcMedia = (notas[i] + calcMedia) / notas.length;
        }
        return calcMedia;
    }

    public float getMedia() {
        return media;
    }

    public void exibirPessoa() {
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Notas da pessoa:" + notas[0] + notas[1] + notas[2] + notas[3]);
        System.out.println("A media da pessoa: " + media);
    }

    public String getNome() {
        return nome;
    }

    public float[] getNotas() {
        return notas;
    }

}
