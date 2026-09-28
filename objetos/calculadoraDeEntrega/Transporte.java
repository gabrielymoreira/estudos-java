public class Transporte {
    private String modal;
    private String placa;
    private int capacidadeEmL;
    private int capacidadeEmKg;

    public Transporte(String modal, String placa, int capacidadeEmL,  int capacidadeEmKg) {
        if (capacidadeEmKg < 0 || capacidadeEmL < 0)
            throw new IllegalArgumentException();
        this.modal = modal;
        this.placa = placa;
        this.capacidadeEmL = capacidadeEmL;
        this.capacidadeEmKg = capacidadeEmKg;
    } // construtor permite o preenchimento das informações na main

    public String getModal() { // para formatar uma informação, mudando apenas na impressão
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getPlaca() {
        return placa + "-";
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadeEmL() {
        return capacidadeEmL;
    }

    public void setCapacidadeEmL(int capacidadeEmL) {
        if (capacidadeEmL < 0)
            throw new IllegalArgumentException();
        this.capacidadeEmL = capacidadeEmL;
    }

    public int getCapacidadeEmKg() {
        return capacidadeEmKg;
    }

    public void setCapacidadeEmKg(int capacidadeEmKg) {
        if (capacidadeEmKg < 0)
            throw new IllegalArgumentException();
        this.capacidadeEmKg = capacidadeEmKg;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "modal='" + modal + '\'' +
                ", placa='" + placa + '\'' +
                ", capacidadeEmL=" + capacidadeEmL +
                ", capacidadeEmKg=" + capacidadeEmKg +
                '}';
    }
}
