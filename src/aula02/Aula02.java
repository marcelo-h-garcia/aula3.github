
package aula02;


public class Aula02 {

    
    public static void main(String[] args) {
         Caneta c1 = new Caneta();
         c1.modelo = "BIC CRISTAL";
         c1.cor = "Azul";
         //c1.ponta = 0.5f; não consegue acessar pq é privado
         c1.carga = 80; //O método main consegue acessar o atributo carga porque está
                        //utilizando o objeto Caneta c1
        //c1.tampada = true;
         c1.tampar(); //O método tampar pode mexer no atributo (private)tampada
                      //porque é publico e está dentro da mesma classe.
         c1.status();
         
    }
    
}
