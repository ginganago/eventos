package org.ginganago.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "event")
@Getter
@Setter
@RequiredArgsConstructor
@SequenceGenerator(name = "event_sequence", schema = "public", sequenceName = "seq_event_id", allocationSize = 1)
public class Event extends PanacheEntityBase {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_sequence")
    private Long id;

    @Column(name = "name")
    private String name;

}
