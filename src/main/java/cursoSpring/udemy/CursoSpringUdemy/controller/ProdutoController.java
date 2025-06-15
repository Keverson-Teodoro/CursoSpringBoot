package cursoSpring.udemy.CursoSpringUdemy.controller;

import cursoSpring.udemy.CursoSpringUdemy.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cursoSpring.udemy.CursoSpringUdemy.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;


    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto saveProduct(@RequestBody Produto produto){

        System.out.println("Produto recebido com sucesso! " + produto);

        produtoRepository.save(produto);
        return produto;
    }

    
    

    
    
}
