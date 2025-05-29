package Sugerencias;
import Atuendos.Atuendo;
import Usuario.Usuario;
import Prenda.Prenda;
import ServicioDelTiempo.*;
import java.util.ArrayList;
import java.util.List;

public class SugerenciadorBasico extends Sugerenciador {

  public SugerenciadorBasico(ServicioMeteorologico servicioMeteorologico){
    super(servicioMeteorologico);
  }

  @Override
  public List<Atuendo> generarSugerencias(Usuario usuario){

    List<Prenda> prendasSuperiores =  usuario.getGuardarropas().getPrendasSuperiores();
    List<Prenda> prendasInferiores = usuario.getGuardarropas().getPrendasInferiores();
    List<Prenda> calzados = usuario.getGuardarropas().getCalzados();

    List<Atuendo> atuendos = new ArrayList<>();

    for (Prenda sup : prendasSuperiores) {
      for (Prenda inf : prendasInferiores) {
        for (Prenda calzado : calzados) {
          atuendos.add(new Atuendo(sup, inf, calzado,null));
        }
      }
    }

    return atuendos;
  }
}
