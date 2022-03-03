public class Sintaxe {
    public static void main(String[] args) {
        System.out.println("Olá mundo!\n");
        float preco = 30;
        var x = 3;

        System.out.println("O preco é " + preco + " reais");

        if (preco > 30) {
            System.out.println("O preco é maior que 30 reais.");
        } else {
            System.out.println("O preco é menor que 30 reais.");
        }

        // int i;
        for (int i = 0; i <= 10; i++) {
            System.out.println(" olá, estamos na estrutura do for ");
            System.out.println(i);
        }

        int p = 0;
        while (p < 10) {
            System.out.println("estrutura do while: " + p);
            p++;
        }

        int y = 25;
        do {
            System.out.println("estrutura do do{}while: " + y);
            y++;
        } while (y < 10);

    }
}