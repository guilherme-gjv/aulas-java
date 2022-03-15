import java.util.Scanner;

public class Pessoa {
    String nome;
    String telefone;
    int idade;
    float saldo;
    Animal[] animais = new Animal[5];

    Scanner leitor = new Scanner(System.in);
    // Scanner leitorString = new Scanner(System.in);

    Pessoa() {
        System.out.println("Digite o nome da Pessoa: ");
        nome = leitor.nextLine();
        System.out.println("Telefone: ");
        telefone = leitor.nextLine();
        System.out.println("Idade: ");
        idade = leitor.nextInt();
        System.out.println("Saldo: ");
        saldo = leitor.nextFloat();
    }

    boolean adicionarAnimal(Animal novoAnimal) {
        boolean resultadoDaCompra = false;
        for (int i = 0; i < 5; i++) {
            if (animais[i] == null) {
                animais[i] = novoAnimal;
                resultadoDaCompra = true;
                break;
            }
        }
        return resultadoDaCompra;
    }

    void exibirPessoa() {
        System.out.println(" ");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
        System.out.println("Saldo: " + saldo);
        exibirAnimaisDaPessa();
    }

    void exibirAnimaisDaPessa() {
        System.out.println("Animais de " + nome);
        for (int i = 0; i < 5; i++) {
            if (animais[i] != null) {
                System.out.println(animais[i].nome);
            }
        }
    }

}
