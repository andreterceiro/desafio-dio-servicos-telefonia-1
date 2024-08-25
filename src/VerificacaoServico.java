import java.util.Scanner;

/**
 * Classe para execução do desafio todo da DIO.
 */
public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        // Eu comentei algumas saídas na tela pois elas faziam com que os testes da DIO quebrassem
        // System.out.print("Digite o serviço que deve ser verificado: ");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        // System.out.print("Digite o nome do cliente e a lista de serviços, seperados por vírgula: ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        for (String parteSegundaEntradaCliente: partes) {
            parteSegundaEntradaCliente = parteSegundaEntradaCliente.trim().toLowerCase();
            if (parteSegundaEntradaCliente.equals(servico)) {
                contratado = true;
            }
        }

        scanner.close();

        // System.out.print("O serviço foi contratado? ");

        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
}