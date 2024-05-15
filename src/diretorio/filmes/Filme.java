package diretorio.filmes;

import java.util.ArrayList;

public class Filme {
    private String nomeFilme;
    private int dataLancamentoFilme;
    private String diretorFilme;
    private double avaliacaoFilme;
    private double notasFilme;
    private String atoresDoFilme;

    public Filme(String nome) {
        this.setNomeFilme(nome);
    }

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
        System.out.println("\n\n" +"Nome do Filme: " + nomeFilme);
        System.out.println("Data de Lançamento do Filme: " + dataLancamentoFilme);
        System.out.println("Avaliação Geral do Filme: " + getNotasFilme());
        System.out.println("Atores do filme: " + atoresDoFilme);
        System.out.println("Diretor do filme: " + diretorFilme );
    }

    public void avaliar(double nota){
        notasFilme += nota;
        avaliacaoFilme++;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    /*  FOI INTRODUZIDO DIRETO NO GET
  double obeterMedia(){
        return notasFilme / avaliacaoFilme;
    }
    */

    @Override
    public String toString() {
        return this.nomeFilme;
    }
}
