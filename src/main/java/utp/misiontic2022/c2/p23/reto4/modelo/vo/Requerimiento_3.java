package utp.misiontic2022.c2.p23.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
    private String cargo;
    private int maxSalario;

    public Requerimiento_3() {
    }

    public Requerimiento_3(String cargo, int maxSalario) {
        this.cargo = cargo;
        this.maxSalario = maxSalario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMaxSalario() {
        return maxSalario;
    }

    public void setMaxSalario(int maxSalario) {
        this.maxSalario = maxSalario;
    }
}
