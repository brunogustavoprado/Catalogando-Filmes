import diretorio.filmes.Filme;
import diretorio.series.series;

public class Main {
    public static void main(String[] args) {
      series jovemSheldon = new series();
      Filme breakingBad = new Filme();


      jovemSheldon.setNomeSerie("Jovem Sheldon");
      jovemSheldon.setDataLancamentoSerie(2017);
      jovemSheldon.setAtoresDaSerie("null");
      jovemSheldon.setDiretorSerie("null");
      jovemSheldon.setTemporadas(7);


      breakingBad.setNomeFilme("Breaking Bad");
      breakingBad.setDataLancamentoFilme(2015);
      breakingBad.setAtoresDoFilme("null");
      breakingBad.setDiretorFilme("null");

      breakingBad.avaliar(8);
      breakingBad.avaliar(9);
      jovemSheldon.avaliar(4);
      jovemSheldon.avaliar(10);
      breakingBad.exibeFichaTecnica();
      jovemSheldon.exibeFichaTecnica();
    }
}
