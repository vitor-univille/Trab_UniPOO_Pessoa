import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    ArrayList<Pessoa> lista = new ArrayList<>();

    public Pessoa getByid(int id){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id){
                return lista.get(i);
            }
        }
        return null;
    }

    public List<Pessoa> getAll(){
        return lista;
    }
    public void add(Pessoa pessoa){
        lista.add(pessoa);
    }

    public void delete(Pessoa pessoa){
        lista.remove(pessoa);
    }

}
