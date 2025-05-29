package Prenda;

public class PrendaInvalidaException extends RuntimeException {

  public PrendaInvalidaException(String message) {
    super("No se genero la prenda porque: " + message);
  }

}
