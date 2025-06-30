package cursoSpring.udemy.CursoSpringUdemy.controller;

import cursoSpring.udemy.CursoSpringUdemy.repository.ProdutoRepository;
import cursoSpring.udemy.CursoSpringUdemy.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import cursoSpring.udemy.CursoSpringUdemy.model.Produto;
import org.yaml.snakeyaml.introspector.Property;

import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    private final ProdutoService produtoService;


    public ProdutoController(ProdutoRepository produtoRepository, ProdutoService produtoService) {
        this.produtoRepository = produtoRepository;
        this.produtoService = produtoService;
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

    @DeleteMapping("{id}")
    public String excluir(@PathVariable("id") long id){
        return produtoService.deletarProduto(id);
    }



    
    

    
    
}
