// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Professor{
    private String nome;
    private int idade;
    private String tipo;

    public Professor(){
        nome = "n"; idade = 0; tipo = "parcial";
    }
    public Professor(Professor b){
        nome = "prof"; idade = 1; tipo = "integral";
    }

    public String getNome() {return nome;}
    public int getIdade() {
        return idade;
    }
    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}