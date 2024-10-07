package BlogAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'username' mezőben. A mező nem lehet üres.")
    private String username;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'name' mezőben. A mező nem lehet üres.")
    private String name;
    @Column(nullable = false)
    @Email
    @NotEmpty(message = "Hiba a 'email' mezőben. A mező nem lehet üres.")
    private String email;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'phone' mezőben. A mező nem lehet üres.")
    private String phone;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'joinDate' mezőben. A mező nem lehet üres.")
    private String joinDate;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'banned' mezőben. A mező nem lehet üres.")
    private Boolean banned;

}
