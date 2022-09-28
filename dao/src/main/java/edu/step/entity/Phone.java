package edu.step.entity;

import edu.step.entity.parent.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "phones")
@Getter
@Setter
public class Phone extends BaseEntity {

    @Basic
    @Column(name = "country_code")
    private String countryCode;

    @Basic
    @Column(name = "operator_code")
    private Integer operatorCode;

    @Basic
    @Column(name = "mobile")
    private Integer mobile;

    //------------------------------------------------------------------------------------------------------------------

    @ManyToOne
    @JoinColumn(name = "human_id")
    private Person human;
}
