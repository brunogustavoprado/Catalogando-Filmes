package diretorio.filmes;

public class Filme {
    private String nomeFilme;
    private int dataLancamentoFilme;
    private String diretorFilme;
    private double avaliacaoFilme;
    private double notasFilme;
    private String atoresDoFilme;

    public double getNotasFilme(){
        return notasFilme / avaliacaoFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setDataLancamentoFilme(int dataLancamentoFilme) {
        this.dataLancamentoFilme = dataLancamentoFilme;
    }

    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }

    public void setAtoresDoFilme(String atoresDoFilme) {
        this.atoresDoFilme = atoresDoFilme;
    }

    public void exibeFichaTecnica(){
        System.out.println("\n\n" +"Nome do diretorio.filmes.Filme: " + nomeFilme);
        System.out.println("Data de Lançamento do diretorio.filmes.Filme: " + dataLancamentoFilme);
        System.out.println("Avaliação Geral do diretorio.filmes.Filme: " + getNotasFilme());
        System.out.println("Atores do filme: " + atoresDoFilme);
        System.out.println("Diretor do filme: " + diretorFilme );
    }

    public void avaliar(double nota){
        notasFilme += nota;
        avaliacaoFilme++;
    }

  /*  FOI INTRODUZIDO DIRETO NO GET
  double obeterMedia(){
        return notasFilme / avaliacaoFilme;
    }
    */
}
