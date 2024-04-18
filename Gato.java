package Animals;
import java.util.Arrays;

public class Gato extends Animal {
    String raca;
    boolean fiv;
    boolean felv;
    String cor;
    boolean limpo;

    public Gato(String nome, String tutor, String especie, String genero, Double peso, String porte, int idade, boolean castrado, String raca, boolean fiv, boolean felv, String cor){
        this.nome = nome;
        this.tutor = tutor;
        this.especie = especie;
        this.genero = genero;
        this.peso = peso;
        this.porte = porte;
        this.idade = idade;
        this.castrado = castrado;
        this.raca = raca;
        this.fiv = fiv;
        this.felv = felv;
        this.cor = cor;
        this.limpo = false;
    }
    public void Miar(){
        System.out.println("MEOOOOOOOOOOOOOOOOOOOOOOOOOOW");
    }

    public void Ronronar(){
        System.out.println("*sons de motor de fusca*");
    }

    public void Banho(){
        this.limpo = true;
    }

    public void AmassarPao(){
        System.out.println("*amassando pãozinho*");
    }

    public void Dados(){
        String dados[] = {nome,tutor,especie,genero,Double.toString(peso),porte,Integer.toString(idade),Boolean.toString(castrado),raca,Boolean.toString(fiv),Boolean.toString(felv),cor};
        System.out.println(Arrays.toString(dados));
    }

    public static void main(String[] args){
        Gato felix = new Gato("Felix","Érick","Felis Catus","Masculino",4.1,"Grande",5,false,"Sphynx",false,false,"Preto");

        felix.Beber();
        felix.Ronronar();
        felix.Dados();
    }
}
