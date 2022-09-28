package edu.step.dto;

import edu.step.dto.parent.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AddressDto extends BaseDto {

    private String country;
    private String city;
    private String street;
    private String house;
    private Integer room;
    private PersonDto person;

}
