package BlogAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name= "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'content' mezőben. A mező nem lehet üres.")
    private Long content;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'postId' mezőben. A mező nem lehet üres.")
    private Long postId;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'authorId' mezőben. A mező nem lehet üres.")
    private Long authorId;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'createdAt' mezőben. A mező nem lehet üres.")
    private LocalDate createdAt;

}

