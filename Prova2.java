package prova2;

public class Prova2 {
    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(
            10, 30, 0, 22, 6, 2026, "Henrique", "Dr. Silva"
        );

        System.out.println("Consulta P1:");
        p1.exibirConsulta();

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("\nConsulta P2:");
        p2.exibirConsulta();

        System.out.println("\nAlterando valores de P1...");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("\nConsulta P1 (alterada):");
        p1.exibirConsulta();

        System.out.println("\nQuantidade de consultas criadas: " + p1.getAmostra());
    }
}
