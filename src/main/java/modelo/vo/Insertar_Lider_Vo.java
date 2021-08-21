package modelo.vo;

public class Insertar_Lider_Vo {
    private Integer id_Lider, salario, clasificacion;
    private String nombre;
    private String primer_Apellido,segundo_Apellido, ciudadR, Cargo, documento,fechaNacimiento;
    public Insertar_Lider_Vo() {
    }
    public Integer getId_Lider() {
        return id_Lider;
    }
    public void setId_Lider(Integer id_Lider) {
        this.id_Lider = id_Lider;
    }
    public Integer getSalario() {
        return salario;
    }
   
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    public Integer getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(Integer clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimer_Apellido() {
        return primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }
    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }
    public String getCiudadR() {
        return ciudadR;
    }
    public void setCiudadR(String ciudadR) {
        this.ciudadR = ciudadR;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setString(String string) {
    }

    

    
 
    
    
    
}
