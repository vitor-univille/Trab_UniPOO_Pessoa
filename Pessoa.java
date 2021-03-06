public class Pessoa {
    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString()
    {
        return "[id: " + this.id + ", " + "nome: " + this.nome + "]";
    }

}
