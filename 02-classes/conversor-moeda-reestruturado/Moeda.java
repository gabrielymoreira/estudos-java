public class Moeda {
    String nome;
    double cotacao;

    public Moeda(String nome, double cotacao) {
        this.nome = nome;
        this.cotacao = cotacao;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "nome='" + nome + '\'' +
                ", cotacao=" + cotacao +
                '}';
    }
}
