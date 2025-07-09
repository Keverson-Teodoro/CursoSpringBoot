package cursoSpring.udemy.CursoSpringUdemy.service;

import cursoSpring.udemy.CursoSpringUdemy.model.Produto;
import cursoSpring.udemy.CursoSpringUdemy.repository.ProdutoRepository;
import org.springframework.stereotype.Service;


@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public String deletarProduto(long id){

        Produto produto = produtoRepository.getReferenceById(id);
        produtoRepository.deleteById(id);

        return "Produto " + produto.getName() + " deletado com sucesso";
    }


}
