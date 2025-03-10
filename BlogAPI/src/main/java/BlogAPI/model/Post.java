package BlogAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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
    @NotEmpty(message = "Hiba a 'Title' mezőben. A mező nem lehet üres.")
    private Long categoryId;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'image' mezőben. A mező nem lehet üres.")
    private String image;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'title' mezőben. A mező nem lehet üres.")
    private String title;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'content' mezőben. A mező nem lehet üres.")
    private String content;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'closed' mezőben. A mező nem lehet üres.")
    private Boolean closed;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'createdAt' mezőben. A mező nem lehet üres.")
    private LocalDate createdAt;
    @Column(nullable = false)
    private LocalDate updatedAt;

}
