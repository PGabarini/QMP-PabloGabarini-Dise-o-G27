package Sugerencias;
import Atuendos.Atuendo;
import Usuario.Usuario;
import Prenda.*;
import ServicioDelTiempo.*;
import java.util.List;
import java.util.ArrayList;

public class SugerenciadorMayores extends Sugerenciador {

  public SugerenciadorMayores(ServicioMeteorologico servicioMeteorologico){
    super(servicioMeteorologico);
  }

  public List<Prenda> getPrendasValidas(Usuario usuario) {
    if (usuario.getEdad() > 55) {
      usuario.getGuardarropas().getPrendas().stream().
          filter(p -> p.getOcasion() != Ocasion.INFORMAL).toList();
    }
      return usuario.getGuardarropas().getPrendas();

  }


    public List<Atuendo> generarSugerencias(Usuario usuario){

        List<Prenda> prendasValidas = getPrendasValidas(usuario);

        List<Prenda> prendasSuperiores =  prendasValidas.stream().filter(p ->
                            p.getCategoria() == Categoria.SUPERIOR).toList();
        List<Prenda> prendasInferiores = prendasValidas.stream().filter(p ->
            p.getCategoria() == Categoria.INFERIOR).toList();
        List<Prenda> calzados = prendasValidas.stream().filter(p ->
            p.getCategoria() == Categoria.CALZADO).toList();

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
