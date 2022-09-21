package edu.step.entity;

import edu.step.entity.parent.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "humans")
@Getter
@Setter
public class Human extends BaseEntity {

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @Basic
    @Column(name = "patronymic")
    private String patronymic;

    @Basic
    @Column(name = "age")
    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    //------------------------------------------------------------------------------------------------------------------

    @OneToMany(mappedBy = "human", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Phone> phoneList;

    //------------------------------------------------------------------------------------------------------------------

    @OneToOne(mappedBy = "human", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;

}
