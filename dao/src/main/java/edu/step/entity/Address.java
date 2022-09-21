package edu.step.entity;

import edu.step.entity.parent.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Address extends BaseEntity {

    @Basic
    @Column(name = "country")
    private String country;

    @Basic
    @Column(name = "city")
    private String city;

    @Basic
    @Column(name = "street")
    private String street;

    @Basic
    @Column(name = "house")
    private String house;

    @Basic
    @Column(name = "room")
    private Integer room;

    //---------------------------------------------------------------------------------

    @OneToOne
    @JoinColumn(name = "human_id", referencedColumnName = "id")
    private Human human;

}
