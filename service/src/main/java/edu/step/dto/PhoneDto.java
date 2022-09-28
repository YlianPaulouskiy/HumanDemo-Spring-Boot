package edu.step.dto;

import edu.step.dto.parent.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PhoneDto extends BaseDto {

    private String countryCode;
    private Integer operatorCode;
    private Integer mobile;
    private PersonDto person;

}
