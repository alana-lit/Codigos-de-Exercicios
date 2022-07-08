import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class VetorNomes {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println("Entre com os nomes:");

        String nome;
        while(!"fim".equals(nome = leitor.nextLine())) {
            nomes.add(nome);
        }

        System.out.println("Indique um indice:");
        int indice = leitor.nextInt();

        if(indice < nomes.size()){
            System.out.println(nomes.get(indice));
        } else {
            System.out.println("Indice inexistente");
        }
    }
}
