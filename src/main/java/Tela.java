public class Tela implements ParametrosIncompletos {
  TipoTela tela;
  TramaTela trama;

  public Tela(TipoTela tela, TramaTela trama) {
    this.tela = tela;
    this.trama = trama;
    if (trama == null){
      this.trama = TramaTela.LISA;
    }
  }

  public boolean parametrosIncompletos(){
    if(tela == null || trama == null){
      return true;
    } else
      return false;
  }


}
