package edu.step.mapper;

import edu.step.dto.PersonDto;
import edu.step.entity.Person;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PersonMapper {

    Person convert(PersonDto personDto);

    PersonDto convert(Person person);

    List<Person> convertToPersonList(List<PersonDto> personDtoList);

    List<PersonDto> convertToPersonDtoList(List<Person> personList);

    @AfterMapping
    default void linkAddress(@MappingTarget Person person) {
        person.getAddress().setHuman(person);
    }

    @AfterMapping
    default void linkPhones(@MappingTarget Person person) {
        person.getPhoneList().forEach(phone -> phone.setHuman(person));
    }
}
