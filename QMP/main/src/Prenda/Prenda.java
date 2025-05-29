package Prenda;
import ServicioDelTiempo.Humedad;

public class Prenda {
  private TipoPrenda tipo;
  private Material material;
  private Color colorPrincipal;
  private Color colorSegundario;
  private Trama trama;
  private Ocasion ocasion;
  private int tempSoportada;
  private Humedad humedadSoportada;

  public Prenda(TipoPrenda tipo, Material material, Trama trama, Color colorPrincipal,
                Color colorSecundario, Ocasion ocasion, int tempSoportada,Humedad humedadSoportada ) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSegundario = colorSecundario;
    this.trama = trama;
    this.ocasion = ocasion;
    this.tempSoportada = tempSoportada;
    this.humedadSoportada = humedadSoportada;
  }

  public Categoria getCategoria() {
    return tipo.getCategoria();
  }

  public Ocasion getOcasion() {
    return ocasion;
  }

  public TipoPrenda getTipo() {
    return tipo;
  }

  public boolean soportaTemperatura(int temperatura){
    return temperatura< tempSoportada;
  }

  public boolean soportaHumedad(Humedad humedad){
      return humedadSoportada== humedad;
  }

}
