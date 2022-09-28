package edu.step.dto;

import edu.step.dto.parent.BaseDto;
import edu.step.entity.Gender;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PersonDto extends BaseDto {

    private String name;
    private String lastName;
    private String patronymic;
    private Integer age;
    private Gender gender;
    private List<PhoneDto> phoneList;
    private AddressDto address;

}
