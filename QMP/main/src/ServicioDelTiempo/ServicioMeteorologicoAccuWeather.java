package ServicioDelTiempo;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.time.Duration;

public class ServicioMeteorologicoAccuWeather {

  private Map<String, RespuestaMeteorologica> ultimasRespuestas;
  private AccuWeatherAPI api;
  private Duration periodoDeValidez;


  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoDeValidez, String direccion) {
    this.api = api;
    this.periodoDeValidez = periodoDeValidez;
    this.ultimasRespuestas = new HashMap<String, RespuestaMeteorologica>();
  }

  public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion){

    if (!this.ultimasRespuestas.containsKey(direccion) || this.ultimasRespuestas.get(direccion).expiro()) {
      ultimasRespuestas.put(direccion,new RespuestaMeteorologica( this.consultarApi(direccion), this.getProximaExpiracion()) );
    }
    return this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();

}

  private EstadoDelTiempo consultarApi(String direccion) {
    Map<String, Object> datos = api.getWeather(direccion).get(0);
    int temperatura = (int) datos.get("Temperature");
    Humedad humedad = (double) datos.get("Humidity") > 0.8 ? Humedad.LLUVIOSO : Humedad.SECO;
    return new EstadoDelTiempo(temperatura, humedad);
  }

  public LocalDateTime getProximaExpiracion() {
    return LocalDateTime.now().plus(periodoDeValidez);
  }

}