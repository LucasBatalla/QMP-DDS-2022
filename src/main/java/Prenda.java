public class Prenda {
  private TipoPrenda tipo;
  private CategoriaPrenda categoria;
  private MaterialPrenda material;
  private Colores colorPrincipal;
  private  Boolean tieneColorSecundario;


  public Prenda(TipoPrenda tipo, CategoriaPrenda categoria, MaterialPrenda material, Colores colorPrincipal, Boolean tieneColorSecundario) {
    this.tipo = tipo;
    this.categoria = categoria; //En este caso se tendria que verificar que la categoria se corresponda con su tipo (para eso tenemos la clase)
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.tieneColorSecundario = tieneColorSecundario;
  }

  public CategoriaPrenda getCategoria() {
    return categoria;
  }

  public Boolean tieneColorSecundario(){
    return tieneColorSecundario;
  }
}
