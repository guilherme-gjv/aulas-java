import java.util.Scanner;

public class Pessoa {
    private String nome, profissao;
    private int cpf;
    private Scanner leitor = new Scanner(System.in);

    public Pessoa() {
        System.out.println(" --- Registrar Pessoa --- ");
        System.out.println("Nome:");
        nome = leitor.nextLine();
        System.out.println("Profissão");
        profissao = leitor.nextLine();
        System.out.println("CPF: ");
        cpf = leitor.nextInt();
    }

    public void atualizar() {
        System.out.println(" --- Atualizar Pessoa --- ");
        System.out.println("Nome:");
        nome = leitor.nextLine();
        System.out.println("Profissão");
        profissao = leitor.nextLine();
        System.out.println("CPF: ");
        cpf = leitor.nextInt();
    }

    public void exibirPessoa() {
        System.out.println(" --- Dados da Pessoa --- ");
        System.out.println("Nome: " + nome);
        System.out.println("Profissão: " + profissao);
        System.out.println("CPF: " + cpf);
    }

    public int getCpf() {
        return cpf;
    }
}
