
package modelo;


public class Cliente extends Persona{
    private String nit;

    public Cliente(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Cliente(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Cliente(){};

    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nac) {
        super(nombres, apellidos, direccion, telefono, fecha_nac);
        this.nit = nit;
    }

    
    
    @Override
    public void agregar(){
        System.out.println("NIT: "+ getNit());
        System.out.println("Nombre: "+ getNombres());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("Fecha de Nacimiento: "+ this.getFecha_nac());
 
    };

}