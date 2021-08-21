package modelo.vo;

public class Requerimiento_2Vo {
    // Su código
    private Integer ID_Proyecto;
    private String nombreMaterial;
    private Integer precioUnidad;

    public Requerimiento_2Vo() {
    }
    
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getNombreMaterial() {
        return nombreMaterial;
    }
    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
    public Integer getPrecioUnidad() {
        return precioUnidad;
    }
    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    @Override
    public String toString() {
        return ID_Proyecto + " " + nombreMaterial + " " + precioUnidad;
    }
    

}
