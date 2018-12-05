
package ejercicio3;

public class personas {
   public String nombre;
    public int telefono;
    
    public personas(String nom, int tel){
        nombre = nom;
        telefono = tel;
    }
    //imprimo los datos de las personas
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getTelefono(){
        return telefono;
    }
}

