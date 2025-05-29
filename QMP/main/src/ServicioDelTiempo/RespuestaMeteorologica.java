package ServicioDelTiempo;

import java.time.LocalDateTime;
import java.util.Map;

public class RespuestaMeteorologica{

  public LocalDateTime expiracion;
  public EstadoDelTiempo estadoDelTiempo;

  public RespuestaMeteorologica(EstadoDelTiempo estadoDelTiempo, LocalDateTime expiracion) {
    this.estadoDelTiempo = estadoDelTiempo;
    this.expiracion = expiracion;
  }

  public boolean expiro() {
    return LocalDateTime.now().isAfter(this.expiracion);
  }

  public EstadoDelTiempo getEstadoDelTiempo() {
    return this.estadoDelTiempo;
  }

}
