package cursoSpring.udemy.CursoSpringUdemy.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto {


    @Id
    @Column(name = "id_produto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco")
    private Double price;


    public Produto() {}


    public Produto(long id, String name, String descricao, Double price) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.price = price;
    }




    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", price=" + price +
                '}';
    }
}
