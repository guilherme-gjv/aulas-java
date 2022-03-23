public class Main {

    public static void main(String[] args) {

        // Construtor com parâmetros
        Pessoa p1 = new Pessoa("joao", 2938, new float[4]);
        System.out.println(p1.getNome());
        p1.exibirPessoa();

        // Construtor com Scanner
        Pessoa p2 = new Pessoa();
        p2.exibirPessoa();
    }
}