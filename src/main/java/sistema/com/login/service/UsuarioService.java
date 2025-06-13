package sistema.com.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.com.login.entity.Usuario;
import sistema.com.login.repository.UsuariosRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuariosRepository repo;

    public List<Usuario> ListarTodos(){
        return repo.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id){
        return repo.findById(id);
    }

    public void deletar(long id){
        repo.deleteById(id);
    }

    public Usuario salvar(Usuario login){
        return repo.save(login);
    }

    public boolean existeEmail(String email){
        return repo.findByEmail(email);
    }

}
