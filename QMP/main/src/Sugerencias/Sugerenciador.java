package Sugerencias;
import Usuario.Usuario;
import Atuendos.Atuendo;
import Usuario.Guardarropas;
import ServicioDelTiempo.*;
import java.util.List;

public abstract class Sugerenciador {
  private ServicioMeteorologico servicioMeteorologico;

  public Sugerenciador(ServicioMeteorologico servicioMeteorologico){
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarropas){
    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico.obtenerCondicionesClimaticas(direccion);

    List<Atuendo> combinaciones = guardarropas.getAtuendos();

    return combinaciones.stream()
        .filter(atuendo -> atuendo.esAtuendoAptoTemperartura(estadoDelTiempo.getTemperatura()))
        .filter(atuendo -> atuendo.esAtuendoAptoHumedad(estadoDelTiempo.getHumedad()))
        .findFirst().orElse(null);
  }

  abstract List <Atuendo> generarSugerencias(Usuario usuario);
}
