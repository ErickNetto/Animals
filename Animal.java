package Animals;
import java.util.Arrays;

public class Animal{
    String nome;
    String tutor;
    String especie;
    String genero;
    Double peso;
    String porte;
    int idade;
    boolean castrado;

    //public Animal(String nome, String tutor, String especie, String genero, Double peso, String porte, int idade, boolean castrado){
    //    this.nome = nome;
    //    this.tutor = tutor;
    //    this.especie = especie;
    //    this.genero = genero;
    //    this.peso = peso;
    //    this.porte = porte;
    //    this.idade = idade;
    //    this.castrado = castrado;
    //}
    public void Comer(){
        System.out.println("CHOMP CHOMP CHOMP");
    }
    public void Dormir(){
        System.out.println("ZzZzZzZzZzZzZzZzzZzZzzZ");
    }
    public void Banheiro(Integer numero){
        Integer acao = numero;
        System.out.println("O "+nome+" está fazendo o número "+acao);
    }
    public void Andar(){
        System.out.println("*o "+nome+" está andando*");
    }
    public void Correr(){
        System.out.println("*o "+nome+" está correndo*");
    }
    public void Beber(){
        System.out.println("SCHLAP SCHLAP SCHLAP SCHLAP");
    }
    public void Dados(){
        String dados[] = {nome,tutor,especie,genero,Double.toString(peso),porte,Integer.toString(idade),Boolean.toString(castrado)};
        System.out.println(Arrays.toString(dados));
    }
    
    public static void main(String[] args) {
        //Animal Cachorro1 = new Animal("Felício","Érick","Canis lupus familliaris","Masculino",43.3,"Grande",12,false);
    }
}
