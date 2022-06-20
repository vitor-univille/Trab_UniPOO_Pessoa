import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PessoaDAO pedao = new PessoaDAO();
        Pessoa n1 = new Pessoa(12,"n1");
        Pessoa n2 = new Pessoa(15,"n2");
        Pessoa n3 = new Pessoa(16,"n3");
        Pessoa n4 = new Pessoa(18,"n4");
        pedao.add(n1);
        pedao.add(n2);
        pedao.add(n3);
        pedao.add(n4);
        System.out.println(pedao.getAll());
        pedao.delete(n3);
        System.out.println(pedao.getAll());
        System.out.println(pedao.getByid(12));
    }
}
