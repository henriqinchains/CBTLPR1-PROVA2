package prova2;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }

    public Data(int d, int m, int a) {
        if (dataValida(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            throw new IllegalArgumentException("Data inválida!");
        }
    }

    public void setDia(int d) {
        if (dataValida(d, mes, ano)) {
            this.dia = d;
        } else {
            throw new IllegalArgumentException("Dia inválido!");
        }
    }

    public void setMes(int m) {
        if (m >= 1 && m <= 12 && dataValida(dia, m, ano)) {
            this.mes = m;
        } else {
            throw new IllegalArgumentException("Mês inválido!");
        }
    }

    public void setAno(int a) {
        if (a >= 1 && dataValida(dia, mes, a)) {
            this.ano = a;
        } else {
            throw new IllegalArgumentException("Ano inválido!");
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

   private boolean dataValida(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12) return false;
        return d >= 1 && d <= diasNoMes(m, a);
    }

    private int diasNoMes(int m, int a) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) ? 29 : 28;
            default: return 0;
        }
    }
}
