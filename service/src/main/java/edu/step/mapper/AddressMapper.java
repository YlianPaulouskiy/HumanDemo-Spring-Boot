package edu.step.mapper;

import edu.step.dto.AddressDto;
import edu.step.entity.Address;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AddressMapper {

    AddressDto convert(Address address);

    Address convert(AddressDto addressDto);

    @AfterMapping
    default void linkPerson(@MappingTarget Address address) {
        address.getHuman().setAddress(address);
    }
}
