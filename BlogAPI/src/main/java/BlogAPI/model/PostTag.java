package BlogAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "post_tags")
public class PostTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'post_id' mezőben. A mező nem lehet üres.")
    private String post_id;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'tag_id' mezőben. A mező nem lehet üres.")
    private Long tag_id;

}
