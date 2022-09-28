package edu.step.mapper;

import edu.step.dto.PhoneDto;
import edu.step.entity.Phone;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PhoneMapper {

    PhoneDto convert(Phone phone);

    Phone convert(PhoneDto phoneDto);

    List<Phone> convertToPhoneList(List<PhoneDto> phoneDtoList);

    List<PhoneDto> convertToPhoneDtoList(List<Phone> phoneList);

    @AfterMapping
    default void linkPerson(@MappingTarget Phone phone) {
        phone.getHuman().getPhoneList().add(phone);
    }

}
