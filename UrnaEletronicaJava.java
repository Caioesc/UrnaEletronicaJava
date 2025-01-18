import java.util.Scanner;

public class UrnaEletronicaJava{
    
    private int _votosValidos = 0;
    private int _votosNulos = 0;
    private Candidato [] candidatos;
    private String _vencedor;

    public UrnaEletronicaJava(){
        this.candidatos = new Candidato[5];

        this.candidatos[0] = new Candidato("Ada Lovelace", 01);
        this.candidatos[1] = new Candidato("Alan Turing", 02);
        this.candidatos[2] = new Candidato("Marie Curie", 03);
        this.candidatos[3] = new Candidato("Albert Einstein", 04);
        this.candidatos[4] = new Candidato("Ludwig van Beethoven", 05);
    }


    public void receberVoto(String numero){
        
            if(numero.length() == 2){
                switch (numero) {
                    case "01":
                        this.candidatos[0].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[0].getNome() + " registrado.");
                        this._votosValidos++;                  
                        break;
                    case "02":
                        this.candidatos[1].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[1].getNome() + " registrado.");
                        this._votosValidos++;   
                        break;
                    case "03": 
                        this.candidatos[2].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[2].getNome() + " registrado.");
                        this._votosValidos++;      
                        break;
                    case "04": 
                        this.candidatos[3].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[3].getNome() + " registrado.");
                        this._votosValidos++;      
                        break;
                    case "05":
                        this.candidatos[4].incrementarVotos();
                        System.out.println("Voto para " + this.candidatos[4].getNome() + " registrado.");
                        this._votosValidos++;      
                        break;
                    default:
                        System.out.println("Voto nulo registrado.");
                        this._votosValidos++;   
                        this._votosNulos++;
                        break;
                }
            }
            else{
                System.out.println("Voto inválido! Insira um voto com dois números!");
            }
    }
    

    public void apurarResultados() {
        int maiorNumeroDeVotos = -1;
        int quantidadeDeVencedores = 0;

        for (int i = 0; i < candidatos.length; i++) {
            if (candidatos[i].getVotos() > maiorNumeroDeVotos) {
                maiorNumeroDeVotos = candidatos[i].getVotos();
                quantidadeDeVencedores = 1;
                this._vencedor = candidatos[i].getNome();
            } else if (candidatos[i].getVotos() == maiorNumeroDeVotos) {
                quantidadeDeVencedores++;
            }
        }

        if (quantidadeDeVencedores == candidatos.length) {
            this._vencedor = "Empate total entre todos os candidatos!";
        } else if (quantidadeDeVencedores > 1) {
            this._vencedor = "Empate entre candidatos!";
        }
    }

    public void exibirResultados() {
        System.out.println("Resultado da Votação:\n");
        for (int i = 0; i < candidatos.length; i++) {
            double porcentagem = ((double) candidatos[i].getVotos() / (this._votosValidos - this._votosNulos)) * 100;
            System.out.printf("%s: %d votos (%.2f%%)\n", candidatos[i].getNome(), candidatos[i].getVotos(), porcentagem);
        }
        System.out.printf("Votos nulos: %d\n\n", this._votosNulos);

        if (this._vencedor.startsWith("Empate")) {
            System.out.println(this._vencedor);
        } else {
            System.out.printf("Vencedor: %s\n", this._vencedor);
        }
    }

    public int getvotosValidos(){
        return this._votosValidos;
    }
    public int getvotosNulos(){
        return this._votosNulos;
    }


    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UrnaEletronicaJava urna = new UrnaEletronicaJava();

        System.out.println("Bem - vindo à urna Eletrônica! \n");
        System.out.println("Candidatos:\n01 - Ada Lovelace\n02 - Alan Turing\n03 - Marie Curie\n04 - Albert Einstein\n05 - Ludwig van Beethoven ");
                    
        while(urna.getvotosValidos() < 10) {
            System.out.print("\nDigite o número do seu candidato: ");
            String voto = sc.nextLine();
            urna.receberVoto(voto);
        }
        urna.apurarResultados();
        urna.exibirResultados();
        sc.close();
        
    }   
}
