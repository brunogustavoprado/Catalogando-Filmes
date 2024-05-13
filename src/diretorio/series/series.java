package diretorio.series;

public class series {
    private String nomeSerie;
    private int dataLancamentoSerie;
    private String diretorSerie;
    private double avaliacaoSerie;
    private double notasSerie;
    private String atoresDaSerie;
    private int temporadas;

    public double getNotasSerie(){
        return notasSerie / avaliacaoSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public void setDataLancamentoSerie(int dataLancamentoSerie) {
        this.dataLancamentoSerie = dataLancamentoSerie;
    }

    public void setDiretorSerie(String diretorSerie) {
        this.diretorSerie = diretorSerie;
    }

    public void setAtoresDaSerie(String atoresDaSerie) {
        this.atoresDaSerie = atoresDaSerie;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void exibeFichaTecnica(){
        System.out.println("\n\n" +"Nome da serie: " + nomeSerie);
        System.out.println("Data de Lançamento da serie: " + dataLancamentoSerie);
        System.out.println("Avaliação Geral da serie: " + getNotasSerie());
        System.out.println("Atores da serie: " + atoresDaSerie);
        System.out.println("Diretor da serie: " + diretorSerie);
        System.out.println("Temporadas da serie: " + temporadas);
    }

    public void avaliar(double nota){
        notasSerie += nota;
        avaliacaoSerie++;
    }

  /*  FOI INTRODUZIDO DIRETO NO GET
  double obeterMedia(){
        return notasFilme / avaliacaoFilme;
    }
    */


//    public int getTempoTotal() {
//        return temporadas * episodios * tempoEpisodios;
//    }

}


