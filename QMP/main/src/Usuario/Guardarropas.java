package Usuario;

import Atuendos.*;
import Prenda.Prenda;
import java.util.LinkedList;
import java.util.List;

public class Guardarropas {
  List<Prenda> prendasSuperiores;
  List<Prenda> prendasInferiores;
  List<Prenda> calzados;
  List<Prenda> accesorios;

  public Guardarropas() {}

  public List<Prenda> getAccesorios() {
    return accesorios;
  }
   public List<Prenda> getCalzados() {
    return calzados;
   }
   public  List<Prenda> getPrendasSuperiores(){
    return prendasSuperiores;
   }
   public  List<Prenda> getPrendasInferiores(){
    return prendasInferiores;
   }

   public  List<Prenda> getPrendas(){
     List<Prenda> todasLasPrendas = new LinkedList<>();
     if (prendasSuperiores != null) todasLasPrendas.addAll(prendasSuperiores);
     if (prendasInferiores != null) todasLasPrendas.addAll(prendasInferiores);
     if (calzados != null) todasLasPrendas.addAll(calzados);
     if (accesorios != null) todasLasPrendas.addAll(accesorios);
     return todasLasPrendas;
   }

   public List<Atuendo> getAtuendos(){
    List<Atuendo> todosLosAtuendos = new LinkedList<>();
     for (Prenda sup : prendasSuperiores) {
       for (Prenda inf : prendasInferiores) {
         for (Prenda calz : calzados) {
           for (Prenda acc : accesorios) {
             todosLosAtuendos.add(new Atuendo(sup, inf, calz, acc));
           }
         }
       }
     }
     return todosLosAtuendos;
   }
}
