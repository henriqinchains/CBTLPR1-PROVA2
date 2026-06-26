package prova2;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

   public Hora(int h, int m, int s) {
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }

    public void setHora(int h) {
        if (h >= 0 && h <= 23) {
            this.hora = h;
        } else {
            throw new IllegalArgumentException("Hora inválida!");
        }
    }

    public void setMinuto(int m) {
        if (m >= 0 && m <= 59) {
            this.minuto = m;
        } else {
            throw new IllegalArgumentException("Minuto inválido!");
        }
    }

    public void setSegundo(int s) {
        if (s >= 0 && s <= 59) {
            this.segundo = s;
        } else {
            throw new IllegalArgumentException("Segundo inválido!");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

   public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String toString12h() {
        int hora12;
        String periodo;

        if (hora == 0) {
            hora12 = 12;
            periodo = "AM";
        } else if (hora < 12) {
            hora12 = hora;
            periodo = "AM";
        } else if (hora == 12) {
            hora12 = 12;
            periodo = "PM";
        } else {
            hora12 = hora - 12;
            periodo = "PM";
        }

        return String.format("%02d:%02d:%02d %s", hora12, minuto, segundo, periodo);
    }

    public int getSegundosTotais() {
        return (hora * 3600) + (minuto * 60) + segundo;
    }
}
