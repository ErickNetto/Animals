package Animals;



public class Medvet extends Animal{
    String nome;
    String nascimento;
    boolean crmv;
    String especializacao;
    Double valorhora;

    public Medvet(String nome, String nascimento,String especializacao,Double valorhora){
        this.nome = nome;
        this.nascimento = nascimento;
        this.crmv = true;
        this.especializacao = especializacao;
        this.valorhora = valorhora;

    }

    public void Atender(){
        System.out.println("O médico "+this.nome+" está atendendo o animal "+super.nome+".");
    }
    public void Vacinar(){

    }
    public void Contatar(){

    }
    public void Examinar(){

    }
    public static void main(String[] args) {
        Medvet paulo = new Medvet("Paulo","20/04/1978","Gatos",100.50);
        paulo.Atender();
    }
}
