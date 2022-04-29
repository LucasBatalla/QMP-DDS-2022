import com.sun.xml.internal.bind.v2.TODO;

public class Prenda {
  private TipoPrenda tipo;
  private Tela tela;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Prenda prendaBorrador;


  public Prenda(TipoPrenda tipo, Tela tela, Color colorPrincipal, Color tieneColorSecundario) {
    this.tipo = tipo;
    this.tela = tela;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = tieneColorSecundario;
  }

  private void setTipo(TipoPrenda tipo) {
    prendaBorrador.tipo = tipo;
  } // Setters para continuar el borrador

  private void setTela(Tela tela) {
    prendaBorrador.tela = tela;
  }

  private void setColorPrincipal(Color colorPrincipal) {
    prendaBorrador.colorPrincipal = colorPrincipal;
  }

  private void setColorSecundario(Color colorSecundario) {
    prendaBorrador.colorSecundario = colorSecundario;
  }

  private void agregarColorSecundario(Color color) {
    prendaBorrador.colorSecundario = color;
  }

  public CategoriaPrenda getCategoria() {
    return tipo.getCategoria();
  }

  private void guardarBorradorPrenda() {
    prendaBorrador = this; // Se guarda una copia exacta, podria ser un clon pero queremos modificar el objeto prenda original

  }



  private void guardarPrenda() throws ParametrosIncompletosException {
    if (tipo.parametrosIncompletos() || tela.parametrosIncompletos() || colorPrincipal == null) {
      throw new ParametrosIncompletosException("No puede haber campos vacios!, a excepcion del color secundario.");
    } else
    // cargarPrenda
  }

}
