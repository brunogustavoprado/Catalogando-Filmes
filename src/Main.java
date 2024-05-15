import diretorio.filmes.Filme;
import diretorio.series.series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      series jovemSheldon = new series("Jovem Sheldon", 2017);
      Filme breakingBad = new Filme("Breaking Bad");
      Filme oResgate = new Filme("O Resgate");


      //jovemSheldon.setNomeSerie("Jovem Sheldon");
      //jovemSheldon.setDataLancamentoSerie(2017);
      jovemSheldon.setAtoresDaSerie("null");
      jovemSheldon.setDiretorSerie("null");
      jovemSheldon.setTemporadas(7);


     //breakingBad.setNomeFilme("Breaking Bad");
      breakingBad.setDataLancamentoFilme(2015);
      breakingBad.setAtoresDoFilme("null");
      breakingBad.setDiretorFilme("null");

      //oResgate.setNomeFilme("O Resgate");
      oResgate.setDataLancamentoFilme(2019);
      oResgate.setAtoresDoFilme("null");
      oResgate.setDiretorFilme("null");

      breakingBad.avaliar(8);
      breakingBad.avaliar(9);
      jovemSheldon.avaliar(4);
      jovemSheldon.avaliar(10);
      breakingBad.exibeFichaTecnica();
      jovemSheldon.exibeFichaTecnica();
      oResgate.exibeFichaTecnica();

      ArrayList<Filme> listaDeFilmes = new ArrayList<>();

      listaDeFilmes.add(breakingBad);
      listaDeFilmes.add(oResgate);
      System.out.println(listaDeFilmes.get(1).getNomeFilme());
      System.out.println(listaDeFilmes.toString());

      var NovosFilmesDoCatalogo = new Filme("Pica-Pau");

    }
}
