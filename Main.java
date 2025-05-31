import java.util.*;

class Jogo {
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

    public Jogo(int rank, String nomeJogo, String plataforma, int ano, String genero, String editora, double NA_Vendas, double EU_Vendas, double JP_Vendas, double Outras_Vendas, double Vendas_Global) {
        this.rank = rank;
        this.nomeJogo = nomeJogo;
        this.plataforma = plataforma;
        this.ano = ano;
        this.genero = genero;
        this.editora = editora;
        this.NA_Vendas = NA_Vendas;
        this.EU_Vendas = EU_Vendas;
        this.JP_Vendas = JP_Vendas;
        this.Outras_Vendas = Outras_Vendas;
        this.Vendas_Global = Vendas_Global;
    }

    public Jogo(String nomeJogo, String plataforma, int ano) {
        this.nomeJogo = nomeJogo;
        this.plataforma = plataforma;
        this.ano = ano;
    }

    public Jogo(){}

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getNomeDoJogo() {
        return nomeJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeJogo = nomeDoJogo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getNA_Vendas() {
        return NA_Vendas;
    }

    public void setNA_Vendas(double NA_Vendas) {
        this.NA_Vendas = NA_Vendas;
    }

    public double getEU_Vendas() {
        return EU_Vendas;
    }

    public void setEU_Vendas(double EU_Vendas) {
        this.EU_Vendas = EU_Vendas;
    }

    public double getJP_Vendas() {
        return JP_Vendas;
    }

    public void setJP_Vendas(double JP_Vendas) {
        this.JP_Vendas = JP_Vendas;
    }

    public double getOutras_Vendas() {
        return Outras_Vendas;
    }

    public void setOutras_Vendas(double Outras_Vendas) {
        this.Outras_Vendas = Outras_Vendas;
    }

    public double getVendas_Global() {
        return Vendas_Global;
    }

    public void setVendas_Global(double Vendas_Global) {
        this.Vendas_Global = Vendas_Global;
    }

    public Jogo clone() {
        return new Jogo(this.rank, this.nomeJogo, this.plataforma, this.ano, this.genero, this.editora, this.NA_Vendas, this.EU_Vendas, this.JP_Vendas, this.Outras_Vendas, this.Vendas_Global);
    }


    public void ler(String Dados) {
        String[] dados = Dados.split(";");
        this.rank = Integer.parseInt(dados[0]);
        this.nomeJogo = dados[1];
        this.plataforma = dados[2];
        this.ano = Integer.parseInt(dados[3]);
        this.genero = dados[4];
        this.editora = dados[5];
        this.NA_Vendas =  Double.parseDouble(dados[6]);
        this.EU_Vendas =  Double.parseDouble(dados[7]);
        this.JP_Vendas =  Double.parseDouble(dados[8]);
        this.Outras_Vendas =  Double.parseDouble(dados[9]);
        this.Vendas_Global =  Double.parseDouble(dados[10]);
        
    }

    public void imprimir() {
        /* 
        MyIO.println("Rank: " + rank);
        MyIO.println("Nome do Jogo: " + nomeJogo);
        MyIO.println("Plataforma: " + plataforma);
        MyIO.println("Ano: " + ano);
        MyIO.println("Gênero: " + genero);
        MyIO.println("Editora: " + editora);
        MyIO.println("Vendas NA: " + NA_Vendas);
        MyIO.println("Vendas EU: " + EU_Vendas);
        MyIO.println("Vendas JP: " + JP_Vendas);
        MyIO.println("Vendas Outras: " + Outras_Vendas);
        MyIO.println("Vendas Global: " + Vendas_Global);
        */
        System.out.println(this);
    }

    // Método toString
    public String toString() {
        return editora + ". " + nomeJogo + ". " + ano + ". Vendas global: " + Vendas_Global + ".";
    }
}

public class Main {
    public static void main(String[] args) {
        
        //armazenar as info
        int numJogos = MyIO.readInt();
        Jogo[] jogos = new Jogo[numJogos];

        for (int i = 0; i < numJogos; i++) {
            String dadosJogo = MyIO.readLine();
         //  jogos[i] = new Jogo(Integer.parseInt(dadosJogo[0]), dadosJogo[1], dadosJogo[2], Integer.parseInt(dadosJogo[3]), dadosJogo[4], dadosJogo[5], Double.parseDouble(dadosJogo[6]), Double.parseDouble(dadosJogo[7]), Double.parseDouble(dadosJogo[8]), Double.parseDouble(dadosJogo[9]), Double.parseDouble(dadosJogo[10]));
           if (dadosJogo.equals("FIM")) {
                break;
            }
           jogos[i] = new Jogo();
           jogos[i].ler(dadosJogo);            
        }

        String linha = MyIO.readLine();//fim
        linha = MyIO.readLine();
        
        //pesquisar info
        while (!linha.equals("FIM")) {
            String[] info = linha.split(";");
            String nomeDoJogo = info[0];
            int ano = Integer.parseInt(info[1]);
            String editora = info[2];
           
           // boolean encontrado = false;

            for (Jogo jogo : jogos) {
                if (jogo.getNomeDoJogo().equals(nomeDoJogo) && jogo.getAno() == ano && jogo.getEditora().equals(editora)) {
                    MyIO.println(jogo.toString());
                    break;
                }
            }
            
            linha = MyIO.readLine();            
        }

        
    }
}
