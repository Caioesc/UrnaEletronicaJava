import java.util.Scanner;

public class UrnaEletronicaJava{
    
    private int _votosNulos = 0;
    private Candidato [] candidatos;
    private String vencedor;

    public UrnaEletronicaJava(){
        this.candidatos = new Candidato[5];

        this.candidatos[0] = new Candidato("Ada Lovelace", 01);
        this.candidatos[1] = new Candidato("Alan Turing", 02);
        this.candidatos[2] = new Candidato("Marie Curie", 03);
        this.candidatos[3] = new Candidato("Albert Einstein", 04);
        this.candidatos[4] = new Candidato("Ludwig van Beethoven", 05);
    }

    public void receberVoto(int numero){
        String numeroString = String.format("%02d", numero);
        do{
            if(numeroString.length() == 2){
                switch (numeroString) {
                    case "01":
                        this.candidatos[0].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[0].getNome() + "registrado.");                  
                        break;
                    case "02":
                        this.candidatos[1].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[1].getNome() + "registrado.");   
                        break;
                    case "03": 
                        this.candidatos[2].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[2].getNome() + "registrado.");   
                        break;
                    case "04": 
                        this.candidatos[3].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[3].getNome() + "registrado.");   
                        break;
                    case "05":
                        this.candidatos[4].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[4].getNome() + "registrado.");   
                        break;
                    default:
                        System.out.println("Voto nulo registrado.");
                        this._votosNulos++;
                        break;
                }
            }
            else{
                System.out.println("Voto inválido! Insira um voto com dois números!");
            }
        }while(numeroString.length() != 2);
    }
    

    public void apurarResultados(){

        if(candidatos[0].getVotos() > candidatos[1].getVotos() && candidatos[0].getVotos() > candidatos[2].getVotos() && candidatos[0].getVotos() > candidatos[3].getVotos() && candidatos[0].getVotos() > candidatos[4].getVotos()){
            this.vencedor = candidatos[0].getNome();
        }
        if(candidatos[1].getVotos() > candidatos[0].getVotos() && candidatos[1].getVotos() > candidatos[2].getVotos() && candidatos[1].getVotos() > candidatos[3].getVotos() && candidatos[1].getVotos() > candidatos[4].getVotos()){
            this.vencedor = candidatos[1].getNome();
        }
        if(candidatos[2].getVotos() > candidatos[0].getVotos() && candidatos[2].getVotos() > candidatos[1].getVotos() && candidatos[2].getVotos() > candidatos[3].getVotos() && candidatos[2].getVotos() > candidatos[4].getVotos()){
            this.vencedor = candidatos[2].getNome();
        }
        if(candidatos[3].getVotos() > candidatos[0].getVotos() && candidatos[3].getVotos() > candidatos[1].getVotos() && candidatos[3].getVotos() > candidatos[2].getVotos() && candidatos[3].getVotos() > candidatos[4].getVotos()){
            this.vencedor = candidatos[3].getNome();
        }
        if(candidatos[4].getVotos() > candidatos[0].getVotos() && candidatos[4].getVotos() > candidatos[1].getVotos() && candidatos[4].getVotos() > candidatos[1].getVotos() && candidatos[4].getVotos() > candidatos[3].getVotos()){
            this.vencedor = candidatos[4].getNome();
        }
    }

    public void exibirResultados(){
        System.out.println("Resultado da Votação: \n");
        System.out.printf("Ada Lovelace: %d votos (%.2f%)\n", candidatos[0].getVotos(), (candidatos[0].getVotos()/(10 - this._votosNulos)) );
        System.out.printf("Alan Turing: %d votos (%.2f%)\n", candidatos[1].getVotos(), (candidatos[1].getVotos()/(10 - this._votosNulos)) );
        System.out.printf("Marie Curie: %d votos (%.2f%)\n", candidatos[2].getVotos(), (candidatos[2].getVotos()/(10 - this._votosNulos)) );
        System.out.printf("Albert Einstein: %d votos (%.2f%)\n", candidatos[3].getVotos(), (candidatos[3].getVotos()/(10 - this._votosNulos)) );
        System.out.printf("Ludwig van Beethoven: %d votos (%.2f%)\n", candidatos[4].getVotos(), (candidatos[4].getVotos()/(10 - this._votosNulos)) );
        System.out.printf("Votos nulos: %d \n \n", this._votosNulos);
        System.out.printf("Vencedor: %s", this.vencedor);
    }


    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
    }   
}
