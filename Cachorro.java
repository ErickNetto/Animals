package Animals;
import java.util.Arrays;

public class Cachorro extends Animal{
    String raca;
    boolean cirurgia;
    String cor;

    public Cachorro(String nome, String tutor, String especie, String genero, Double peso, String porte, int idade, boolean castrado, String raca, boolean cirurgia, String cor){
        this.nome = nome;
        this.tutor = tutor;
        this.especie = especie;
        this.genero = genero;
        this.peso = peso;
        this.porte = porte;
        this.idade = idade;
        this.castrado = castrado;
        this.raca = raca;
        this.cirurgia = cirurgia;
        this.cor = cor;
    }
    public void Latir(){
        System.out.println("AUAUAUAUAUAUAUAU");
    }
    public void Refrescar(){
        System.out.println("*o cachorro está se refrescando*");
    }
    public void Dados(){
        String dados[] = {nome,tutor,especie,genero,Double.toString(peso),porte,Integer.toString(idade),Boolean.toString(castrado),raca,Boolean.toString(cirurgia),cor};
        System.out.println(Arrays.toString(dados));
    }

    public static void main(String[] args) {
        Cachorro Duque = new Cachorro("Duque","Érick","Canis lupus familliaris","Masculino",32.4,"Grande",15,false,"Golden Retriever",false,"Dourado");
        
        Duque.Dados();

        
    }
}
