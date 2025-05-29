package Prenda;

public enum TipoPrenda{
  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.SUPERIOR),
  PANTALON(Categoria.INFERIOR),
  CHOMBA(Categoria.SUPERIOR),
  COLLAR(Categoria.ACCESORIO);


  private final Categoria categoria;

  TipoPrenda(Categoria categoria)
  {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

}
