package cursoSpring.udemy.CursoSpringUdemy.repository;

import cursoSpring.udemy.CursoSpringUdemy.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByName(String name);
}
