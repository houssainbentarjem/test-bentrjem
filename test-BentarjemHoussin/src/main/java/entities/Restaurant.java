package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurant", nullable = false)
    private Long Id_restaurant;
    private String nom;
    private Long nbPlacesMax;
    @OneToMany
    private List<Menu> menus;
}
