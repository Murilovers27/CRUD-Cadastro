package sistema.com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sistema.com.login.entity.Usuario;

public interface UsuariosRepository extends JpaRepository <Usuario, Long>{
    boolean findByEmail(String email);
    
}
