package co.edu.eam.store.product.entity;

import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Category {
    // TODO: completar categoria con los ENDPOINTS
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
