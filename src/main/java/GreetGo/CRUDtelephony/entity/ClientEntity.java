package GreetGo.CRUDtelephony.entity;

import jakarta.persistence.*;

@Entity
@Table(name="clients")
public class ClientEntity extends AbstractClient{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
