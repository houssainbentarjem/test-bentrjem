package entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString


public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_composant", nullable = false)
    private Long Id_composant;
    private String nomComposant;
    private float prix ;
    @ManyToOne
    private Menu menu;
}

