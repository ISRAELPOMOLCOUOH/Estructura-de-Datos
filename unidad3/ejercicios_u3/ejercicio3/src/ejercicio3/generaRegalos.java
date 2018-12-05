
package ejercicio3;



public class generaRegalos {
    
    public String obtenerRegalo(){
        String regalosAlea;
        String []regalo ={"plancha","lavadora","estufa","microondass","television","celular","modular","cama","laptop","lampara","mesa","sofa","cama","secadora","ventilador","guitarra","platos","ropero","moto","zapatos"};
        regalosAlea = regalo[(int)(Math.floor(Math.random()*((regalo.length-1)-0+1)+0))];
        return regalosAlea;
    }
    
    
}
