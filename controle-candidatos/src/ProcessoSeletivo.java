import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Cleberton", "Geiziane", "Leticia", "Francieli", "Lourdes"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else {
                System.out.println("Contato realizado com sucesso!");
            }

        } while(continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        }
        else {
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de tentativas " + tentativasRealizadas + " realizadas");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Cleberton", "Geiziane", "Leticia", "Francieli", "Lourdes"};
        
        System.out.println("Imprimindo a lista de candidatos informando o indice de elemento.");

        for( int indice = 0; indice <  candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice + 1) + " é o" + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação 'for each'");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidatos);
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Cleberton", "Geiziane", "Leticia", "Francieli", "Lourdes", "David", "Jose", "Ronaldo", "Joao", "Alberto"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 200.0;
        while(candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou salário de: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Estamos aguardando os demais candidatos.");
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar par o candidato com uma contraproposta.");
        }
        else {
            System.out.println("Ligar para o candidato.");
        }
    }

}