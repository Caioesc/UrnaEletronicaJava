public class Candidato {
    private String _nome;
    private int _numero;
    private int _votos;

    public Candidato(String nome, int numero){
        this._nome = nome;
        this._numero = numero;
    }

    public String getNome(){
        return this._nome;
    }
    
    public int getNumero(){
        return this._numero;
    }

    public int getVotos(){
        return this._votos;
    }

    public void incrementarVotos(){
        this._votos += 1;
    }
}
