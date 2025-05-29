package Atuendos;

import Prenda.*;

public class SastreSanJuan implements Sastre {

  public Prenda crearPrendaSuperior(){
    PrendaBuilder builder = new PrendaBuilder(TipoPrenda.CHOMBA);
    builder.especificarMaterial(Material.SEDA);
    builder.especificarColorPrincipal(new Color("Verde"));
    builder.especificarTrama(Trama.PIQUE);
    return builder.buildPrenda();
  }

  public Prenda crearPrendaInferior(){
    PrendaBuilder builder = new PrendaBuilder(TipoPrenda.PANTALON);
    builder.especificarMaterial(Material.ACETATO);
    builder.especificarColorPrincipal(new Color("Gris"));
    return builder.buildPrenda();
  }

  public Prenda crearCalzado(){
    PrendaBuilder builder = new PrendaBuilder(TipoPrenda.ZAPATO);
    builder.especificarMaterial(Material.CUERO);
    builder.especificarColorPrincipal(new Color("Blanco"));
    return builder.buildPrenda();
  }

}
