import java.util.Scanner;

public class UrnaEletronicaJava {
    private int votosNulos = 0;
    Candidato [] candidatos;

    public UrnaEletronicaJava(){
        candidatos = new Candidato[5];

        Candidato ada = new Candidato("Ada Lovelace", 01);
        candidatos[0] = ada;

        Candidato alan = new Candidato("Alan Turing", 02);
        candidatos[1] = alan;

        Candidato marie = new Candidato("Marie Curie", 03);
        candidatos[2] = marie;

        Candidato albert = new Candidato("Albert Einstein", 04);
        candidatos[3] = albert;

        Candidato ludwig = new Candidato("Ludwig van Beethoven", 05);
        candidatos[4] = ludwig;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }   
}
