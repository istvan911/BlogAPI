package BlogAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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
    private String password;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'name' mezőben. A mező nem lehet üres.")
    private String fullName;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'name' mezőben. A mező nem lehet üres.")
    private LocalDate dateOfBirth;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'name' mezőben. A mező nem lehet üres.")
    private String role;
    @Column(nullable = false)
    @Email
    @NotEmpty(message = "Hiba a 'email' mezőben. A mező nem lehet üres.")
    private String email;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'phone' mezőben. A mező nem lehet üres.")
    private String phone;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'createdAt' mezőben. A mező nem lehet üres.")
    private LocalDate createdAt;
    @Column(nullable = false)
    private LocalDate deletedAt;
    @Column(nullable = false)
    @NotEmpty(message = "Hiba a 'banned' mezőben. A mező nem lehet üres.")
    private Boolean banned;

}
