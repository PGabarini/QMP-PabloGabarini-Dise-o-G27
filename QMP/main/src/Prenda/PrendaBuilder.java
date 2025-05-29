package Prenda;

import ServicioDelTiempo.Humedad;

public class PrendaBuilder {
  private TipoPrenda tipo;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Trama trama = Trama.LISA;
  private Ocasion ocasion;
  private int tempSoportada;
  private Humedad humedadSoportada;

  public PrendaBuilder (TipoPrenda tipo){
    if (tipo == null) {
      throw new PrendaInvalidaException("Tipo de prenda nulo");
    }
    this.tipo = tipo;
  }

  public void especificarMaterial(Material material){
    if(material == null){
      throw new PrendaInvalidaException("Material de prenda nulo");
    }
    this.material = material;
  }

  public void especificarColorPrincipal(Color primario){
    if(colorPrincipal == null){
      throw new PrendaInvalidaException("Color principal de prenda nulo");
    }
    this.colorPrincipal = primario;
  }

  public void especificarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  public void especificarTrama(Trama trama){
    if (trama == null){this.trama = Trama.LISA;}
    this.trama = trama;
  }

  public void especificar0casion(Ocasion ocasion){
    this.ocasion = ocasion;
  }

  public void especificarTempSoportada(int tempSoportada){
    this.tempSoportada = tempSoportada;
  }

  public void especificarhumedadSoportada(Humedad humedadSoportada){
    this.humedadSoportada = humedadSoportada;
  }

  public Prenda buildPrenda()
  {
    if(colorPrincipal == null){
      throw new PrendaInvalidaException("Color principal de prenda nulo");
    }
    if(material == null){
      throw new PrendaInvalidaException("Material de prenda nulo");
    }
    return new Prenda(tipo,material,trama,colorPrincipal,colorSecundario,ocasion,tempSoportada,humedadSoportada);
  }

}
