package modelo.vo;

public class Requerimiento_1Vo {
    // Su código
    private Integer ID_Lider;
    private Integer Salario;
    private String ciudad_Residencia;

    public Requerimiento_1Vo() {
    }
    
    public Integer getID_Lider() {
        return ID_Lider;
    }
    public void setID_Lider(Integer iD_Lider) {
        ID_Lider = iD_Lider;
    }
    public Integer getSalario() {
        return Salario;
    }
    public void setSalario(Integer salario) {
        Salario = salario;
    }
    public String getCiudad_Residencia() {
        return ciudad_Residencia;
    }
    public void setCiudad_Residencia(String ciudad_Residencia) {
        this.ciudad_Residencia = ciudad_Residencia;
    }
    @Override
    public String toString() {
        return ID_Lider + " " + Salario + " " + ciudad_Residencia;
    }
    

}
