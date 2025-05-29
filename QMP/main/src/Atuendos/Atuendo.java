package Atuendos;
import Prenda.*;
import ServicioDelTiempo.Humedad;
public class Atuendo {
  public Prenda prendaSuperior;
  public Prenda prendaInferior;
  public Prenda calzado;
  public Prenda accesorio;

  public Atuendo(Prenda PrendaSuperior, Prenda PrendaInferior, Prenda Calzado,Prenda accesorio) {
    this.prendaSuperior = PrendaSuperior;
    this.prendaInferior = PrendaInferior;
    this.calzado = Calzado;
    this.accesorio = accesorio;
  }

  public Atuendo crearSastre(Sastre sastre){

    return new Atuendo( sastre.crearPrendaInferior(),
        sastre.crearPrendaSuperior(),
        sastre.crearCalzado(),
        null);
  }

  public boolean esAtuendoAptoTemperartura(int temperatura){
    return  prendaSuperior.soportaTemperatura(temperatura) &&
            prendaInferior.soportaTemperatura(temperatura) &&
            calzado.soportaTemperatura(temperatura) &&
            accesorio.soportaTemperatura(temperatura);
  }

  public boolean esAtuendoAptoHumedad(Humedad humedad){
    return  prendaSuperior.soportaHumedad(humedad) &&
        prendaInferior.soportaHumedad(humedad) &&
        calzado.soportaHumedad(humedad) &&
        accesorio.soportaHumedad(humedad);
  }
}
