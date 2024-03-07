import java.util.Scanner;

class jogo {
    private int rank;
    private String nomeJogo;
    private String plataforma;
    private int ano;
    private String genero;
    private String editora;
    private double NA_Vendas;
    private double EU_Vendas;
    private double JP_Vendas;
    private double Outras_Vendas;
    private double Vendas_Global;

    public jogo(int rank,String nomeJogo,String plataforma,int ano,String genero,String editora,double NA_Vendas,double EU_Vendas,double JP_Vendas,double Outras_Vendas,double Vendas_Global){
    this.rank = rank;
    this.nomeJogo = nomeJogo;
    this.plataforma = plataforma;
    this.ano = ano;
    this.genero = genero;
    this.editora = editora;
    }

    public jogo(String nomeJogo, String plataforma, int ano) {
        this.nomeJogo = nomeJogo;
        this.plataforma = plataforma;
        this.ano = ano;
    }

    int getRank() {
        return rank;
    }

    void setRank(int rank) {
        this.rank = rank;
    }

    String getnomeJogo() {
        return nomeJogo;
    }

    void setnomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    String getPlataforma() {
        return plataforma;
    }

    void setPlataforma(String plataforma) {
        this.plataforma = plataforma;

    }

    int getAno() {
        return ano;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    String getEditora() {
        return editora;
    }

    void setEditora(String editora) {
        this.editora = editora;
    }

    String getGenero() {
        return genero;
    }

    void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimir() {
        Vendas_Global = NA_Vendas + EU_Vendas + JP_Vendas + Outras_Vendas;
        System.out.printf(nomeJogo + ". " + editora + ". " + ano + ".  Vendas global: " + Vendas_Global );
        System.out.println();
        
    }

    public void clone() {

    }

    public toString(){

    }

    public class lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            if (linha.equals("FIM")) {
                break;
            }
            String[] info = linha.split(",");

    }
    }
}