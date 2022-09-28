package edu.step.mapper;

import edu.step.dto.PersonDto;
import edu.step.entity.Person;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PersonMapper {

    Person convert(PersonDto personDto);

    PersonDto convert(Person person);

    @AfterMapping
    default void linkAddress(@MappingTarget Person person) {
        person.getAddress().setHuman(person);
    }

    @AfterMapping
    default void linkPhones(@MappingTarget Person person) {
        person.getPhoneList().forEach(phone -> phone.setHuman(person));
    }
}
