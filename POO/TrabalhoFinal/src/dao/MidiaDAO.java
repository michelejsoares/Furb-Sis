package dao;

import java.util.List;
import java.util.Optional;
import model.Midia;

public interface MidiaDAO {
	void salvar(Midia m) throws Exception;
    boolean deletar(int id) throws Exception;
    void atualizar(Midia m) throws Exception;
    List<Midia> listarTodos() throws Exception;
    Optional<Midia> buscarPorId(int id) throws Exception;
}
