import java.util.Scanner;

public class Animal {
    String especie;
    String nome;
    String cor;
    int idade;
    boolean domestico;
    float preco;

    Scanner leitor = new Scanner(System.in);

    Animal() {
        System.out.println("--Registro do Animal-- ");
        System.out.println("Espécie: ");
        especie = leitor.nextLine();
        System.out.println("Nome: ");
        nome = leitor.nextLine();
        System.out.println("Cor: ");
        cor = leitor.nextLine();
        System.out.println("Idade: ");
        idade = leitor.nextInt();
        System.out.println("É doméstico? 1 - sim // 2 - não");
        int i = leitor.nextInt();
        if (i == 1) {
            domestico = true;
        }
        if (i == 2) {
            domestico = false;
        }
        System.out.println("Preço: ");
        preco = leitor.nextFloat();
    }

    void exibirAnimal() {
        System.out.println(" ");
        System.out.println("--Informações do Animal--");
        System.out.println("Especie: " + especie);
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
        System.out.println("Doméstico: ");
        if (domestico == true) {
            System.out.println("Animal Doméstico");
        } else {
            System.out.println("Não é Doméstico");
        }
        System.out.println("Preço: " + preco);

    }
}
