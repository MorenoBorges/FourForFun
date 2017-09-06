
package Model;


public class doenca {
 private String nome;
 private String estacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public doenca(String nome, String estacao) {
        this.nome = nome;
        this.estacao = estacao;
    }
 
 
   public doenca(){
   this("","");
   }
}
