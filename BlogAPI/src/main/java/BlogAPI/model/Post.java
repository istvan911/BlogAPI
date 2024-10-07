package BlogAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'Title' mezőben. A mező nem lehet üres.")
    private Long userId;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'image' mezőben. A mező nem lehet üres.")
    private String image;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'title' mezőben. A mező nem lehet üres.")
    private String title;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'description' mezőben. A mező nem lehet üres.")
    private String description;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'closed' mezőben. A mező nem lehet üres.")
    private Boolean closed;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'publishDate' mezőben. A mező nem lehet üres.")
    private String publishDate;

}
