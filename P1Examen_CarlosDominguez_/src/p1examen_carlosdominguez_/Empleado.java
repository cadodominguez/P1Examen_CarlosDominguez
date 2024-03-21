
package p1examen_carlosdominguez_;

public class Empleado {
    String Nombre;
    String Puesto;
    int Salario;
    String Departamento;
    int NdeIdentificacion;
    
    public Empleado(String Nombre, String Puesto, int Salario, String Departamento, int NdeIdentificacion) {
        this.Nombre = Nombre;
        this.Puesto = Puesto;
        this.Salario = Salario;
        this.Departamento = Departamento;
        this.NdeIdentificacion = NdeIdentificacion;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public int getNdeIdentificacion() {
        return NdeIdentificacion;
    }

    public void setNdeIdentificacion(int NdeIdentificacion) {
        this.NdeIdentificacion = NdeIdentificacion;
    }
    
}
