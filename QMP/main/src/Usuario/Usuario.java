package Usuario;

import Sugerencias.Sugerenciador;


public class Usuario {
  public Guardarropas guardarropas;
  public int edad;
  public Sugerenciador sugerenciador;

  public Usuario(int edad,Sugerenciador sugerenciador) {
    this.edad = edad;
    this.sugerenciador = sugerenciador;
  }

  public void setSugerenciador(Sugerenciador sugerenciador) {
    this.sugerenciador = sugerenciador;
  }

  public int getEdad() {
    return this.edad;
  }

  public Guardarropas getGuardarropas() {
    return guardarropas;
  }
}
