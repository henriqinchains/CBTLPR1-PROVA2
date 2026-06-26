package prova2;

import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;

    Scanner scanner = new Scanner(System.in);

    public ConsultaAgendada() {
        setData();
        setHora();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setHora(int h, int m, int s) {
        this.hora = new Hora(h, m, s);
    }

    public void setNomePaciente(String p) {
        if (p.matches(".*\\d.*")) {
            System.out.println("Erro: o nome do paciente não pode conter números.");
        } else {
            this.nomePaciente = p;
        }
    }

    public void setNomeMedico(String m) {
        if (m.matches(".*\\d.*")) {
            System.out.println("Erro: o nome do médico não pode conter números.");
        } else {
            this.nomeMedico = m;
        }
    }

    public void setData() {
        System.out.print("Digite o dia: ");
        int d = scanner.nextInt();
        System.out.print("Digite o mês: ");
        int m = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int a = scanner.nextInt();
        this.data = new Data(d, m, a);
    }

    public void setHora() {
        System.out.print("Digite a hora (0-23): ");
        int h = scanner.nextInt();
        System.out.print("Digite os minutos (0-59): ");
        int mi = scanner.nextInt();
        System.out.print("Digite os segundos (0-59): ");
        int s = scanner.nextInt();
        this.hora = new Hora(h, mi, s);
    }

    public void setNomePaciente() {
        System.out.print("Digite o nome do paciente: ");
        String p = scanner.next();
        setNomePaciente(p);
    }

    public void setNomeMedico() {
        System.out.print("Digite o nome do médico: ");
        String m = scanner.next();
        setNomeMedico(m);
    }

    public String getData() {
        return data.toString();
    }

    public String getHora() {
        return hora.toString();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public int getAmostra() {
        return quantidade;
    }

    public void exibirConsulta() {
        System.out.println("Data: " + getData());
        System.out.println("Hora: " + getHora());
        System.out.println("Paciente: " + getNomePaciente());
        System.out.println("Médico: " + getNomeMedico());
    }
}
