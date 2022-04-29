
public class TipoPrenda implements ParametrosIncompletos { //De esta manera cada tipo va a tener una categoria asociada
  public CategoriaPrenda categoria;


  private TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }
  public CategoriaPrenda getCategoria() {
    return categoria;
  }

  final TipoPrenda ZAPATO = new TipoPrenda(CategoriaPrenda.CALZADO);
  final TipoPrenda CAMISA = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR);
  final TipoPrenda PANTALON = new TipoPrenda(CategoriaPrenda.PARTE_INFERIOR);

  public boolean parametrosIncompletos(){
    if(categoria == null){
      return true;
    } else
      return false;
  }

}
