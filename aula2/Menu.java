import java.util.Scanner;

public class Menu {
    Animal[] animais = new Animal[30];
    Pessoa[] pessoas = new Pessoa[30];

    Scanner leitor = new Scanner(System.in);
    Scanner leitorString = new Scanner(System.in);

    int decisao = 0;

    Menu() {
        do {
            System.out.println("--- PET SHOP ---");
            System.out.println("1 - Venda de animal");
            System.out.println("2 - Exibir pessoas");
            System.out.println("3 - Exibir animais");
            System.out.println("4 - Registrar pessoa");
            System.out.println("5 - Registrar animal");
            System.out.println("6 - Sair");
            decisao = leitor.nextInt();

            switch (decisao) {
                case 1:
                    vendaDeAnimal();
                    break;
                case 2:
                    exibirPessoas();
                    break;
                case 3:
                    exibirAnimais();
                    break;
                case 4:
                    registrarPessoa();
                    break;
                case 5:
                    registrarAnimal();
                    break;
                case 6:
                    System.out.println("saindo do sistema...");
                    break;
            }
        } while (decisao != 6);

    }

    void vendaDeAnimal() {
        System.out.println("--- VENDA ---");
        System.out.println("Digite o nome do cliente: ");
        String nomeDoCliente = leitorString.nextLine();
        System.out.println("Digite o nome do animal: ");
        String nomeDoAnimal = leitorString.nextLine();

        Pessoa cliente = pesquisarPessoa(nomeDoCliente);
        Animal animal = pesquisarAnimal(nomeDoAnimal);

        if (cliente.saldo >= animal.preco) {
            boolean compraBemSucedida;
            compraBemSucedida = cliente.adicionarAnimal(animal);

            if (compraBemSucedida == true) {
                cliente.saldo = cliente.saldo - animal.preco;
                System.out.println("Compra bem sucedida!");
            } else {
                System.out.println("houve um erro na compra!");
            }
        }
    }

    Pessoa pesquisarPessoa(String nomePesquisar) {
        Pessoa pessoaEncontrada = null;
        for (int i = 0; i < 30; i++) {
            if (pessoas[i].nome.equalsIgnoreCase(nomePesquisar)) {
                pessoaEncontrada = pessoas[i];
                break;
            }
        }
        return pessoaEncontrada;
    }

    Animal pesquisarAnimal(String nomePesquisar) {
        Animal animalEncontrado = null;
        for (int i = 0; i < 30; i++) {
            if (animais[i].nome.equalsIgnoreCase(nomePesquisar)) {
                animalEncontrado = animais[i];
                break;
            }
        }
        return animalEncontrado;
    }

    void exibirPessoas() {
        System.out.println("Pessoas Registradas: ");
        for (int i = 0; i < 30; i++) {
            if (pessoas[i] != null) {
                pessoas[i].exibirPessoa();
            }
        }
    }

    void exibirAnimais() {
        System.out.println("Animais Registrados: ");
        for (int i = 0; i < 30; i++) {
            if (animais[i] != null) {
                animais[i].exibirAnimal();
            }
        }
    }

    void registrarPessoa() {
        for (int i = 0; i < 30; i++) {
            if (pessoas[i] == null) {
                // objeto auxiliar
                Pessoa pessoaAux = new Pessoa();
                pessoas[i] = pessoaAux;
                break;
            }
        }
    }

    void registrarAnimal() {
        for (int i = 0; i < 30; i++) {
            if (animais[i] == null) {
                // objeto auxiliar
                Animal animalAux = new Animal();
                animais[i] = animalAux;
                break;
            }
        }
    }
}
