import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private Scanner leitor = new Scanner(System.in);

    public Menu() {
        int opcao = 0;
        do {
            System.out.println(" --- REGISTRO PESSOAS ---");
            System.out.println("digite...");
            System.out.println("1 - Adicionar Pessoa; ");
            System.out.println("2 - Ver Pessoas; ");
            System.out.println("3 - Pesquisar Pessoa; ");
            System.out.println("4 - Atualizar Pessoa; ");
            System.out.println("5 - Deletar Pessoa; ");
            System.out.println("6 - Sair");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    adicionarPessoa();
                    break;
                case 2:
                    if (pessoas.isEmpty()) {
                        System.out.println("Não há pessoas registradas! ");
                    } else {
                        verPessoas();
                    }
                    break;
                case 3:
                    if (pessoas.isEmpty()) {
                        System.out.println("Não há pessoas registradas! ");
                    } else {
                        System.out.println("Digite o cpf da pessoa que quer ver");
                        int cpfPesquisar = leitor.nextInt();
                        verPessoa(cpfPesquisar);
                    }
                    break;
                case 4:
                    if (pessoas.isEmpty()) {
                        System.out.println("Não há pessoas registradas! ");
                    } else {
                        System.out.println("Digite o cpf da pessoa que quer atualizar");
                        int cpfPesquisar2 = leitor.nextInt();
                        atualizarPessoa(cpfPesquisar2);
                    }
                    break;
                case 5:
                    if (pessoas.isEmpty()) {
                        System.out.println("Não há pessoas registradas! ");
                    } else {
                        System.out.println("Digite o cpf da pessoa que quer deletar");
                        int cpfPesquisar3 = leitor.nextInt();
                        deletarPessoa(cpfPesquisar3);
                    }
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    break;
            }
        } while (opcao != 6);
    }

    private void adicionarPessoa() {
        Pessoa pessoaAux = new Pessoa();
        pessoas.add(pessoaAux);
    }

    private void verPessoas() {
        for (int i = 0; i < pessoas.size(); i++) {
            pessoas.get(i).exibirPessoa();
        }
    }

    private void verPessoa(int cpfPessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCpf() == cpfPessoa) {
                pessoas.get(i).exibirPessoa();
            }
        }
    }

    private void atualizarPessoa(int cpfPessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCpf() == cpfPessoa) {
                pessoas.get(i).atualizar();
                break;
            }
        }
    }

    private void deletarPessoa(int cpfPessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCpf() == cpfPessoa) {
                pessoas.remove(i);
            }
        }
    }

}
