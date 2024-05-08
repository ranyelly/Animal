class Animal {
    String nome;
    int idade;
    Animal() {}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    void saoEspertos() {}
}
class Peixe extends Animal {
    String tipo;
    Peixe() {}
    void saoEspertos() {
        System.out.println("Peixes são espertos + peixes Ubaranas nadam rapido.");
        System.out.println("Animais gostam de ar livre + leão é o rei da selva.");
    }
}
public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        peixe.saoEspertos();
    }
}
