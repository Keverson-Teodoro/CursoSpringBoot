package cursoSpring.udemy.CursoSpringUdemy.repository;

import cursoSpring.udemy.CursoSpringUdemy.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
