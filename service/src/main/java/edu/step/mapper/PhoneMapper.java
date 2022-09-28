package edu.step.mapper;

import edu.step.dto.PhoneDto;
import edu.step.entity.Phone;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PhoneMapper {

    PhoneDto convert(Phone phone);

    Phone convert(PhoneDto phoneDto);

    @AfterMapping
    default void linkPerson(@MappingTarget Phone phone) {
        phone.getHuman().getPhoneList().add(phone);
    }

}
