package cursoSpring.udemy.CursoSpringUdemy.controller;

import cursoSpring.udemy.CursoSpringUdemy.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import cursoSpring.udemy.CursoSpringUdemy.model.Produto;

import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;


    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public String salvar(@RequestBody Produto produto){

        produtoRepository.save(produto);
        return "Produto salvo com sucesso!" + produto;
    }

    @GetMapping("/{id}")
    public Produto obterProduto(@PathVariable("id") long id){

        Optional<Produto> produto = produtoRepository.findById(id);

        return produto.orElse(null);
    }



    
    

    
    
}
