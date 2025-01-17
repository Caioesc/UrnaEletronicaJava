import java.util.Scanner;

public class UrnaEletronicaJava {
    
    private int _votosNulos = 0;
    private Candidato [] candidatos;

    public UrnaEletronicaJava(){
        this.candidatos = new Candidato[5];

        this.candidatos[0] = new Candidato("Ada Lovelace", 01);
        this.candidatos[1] = new Candidato("Alan Turing", 02);
        this.candidatos[2] = new Candidato("Marie Curie", 03);
        this.candidatos[3] = new Candidato("Albert Einstein", 04);
        this.candidatos[4] = new Candidato("Ludwig van Beethoven", 05);
    }

    public void receberVoto(int numero){
        
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        
        
    }   
}
