package GreetGo.CRUDtelephony.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="clients", uniqueConstraints = {
        @UniqueConstraint(columnNames = "phone"),
        @UniqueConstraint(columnNames = "secondPhone")
})
public class ClientEntity extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String phone;
    @Column(unique = true)
    private String secondPhone;
    private String birthday;
    @OneToMany(mappedBy = "clientEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AuditEntity> audits = new ArrayList<>();
}
