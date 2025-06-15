package cursoSpring.udemy.CursoSpringUdemy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cursoSpring.udemy.CursoSpringUdemy.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    

    @PostMapping
    public Produto saveProduct(@RequestBody Produto produto){
        System.out.println("Produto recebido com sucesso! " + produto);
        return produto;
    }

    
    

    
    
}
