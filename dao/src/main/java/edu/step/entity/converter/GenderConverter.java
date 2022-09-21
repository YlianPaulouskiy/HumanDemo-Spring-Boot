package edu.step.entity.converter;

import edu.step.entity.Gender;

import javax.persistence.AttributeConverter;
import java.util.stream.Stream;

public class GenderConverter implements AttributeConverter<Gender, String> {


    @Override
    public String convertToDatabaseColumn(Gender attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getGender();
    }

    @Override
    public Gender convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        return Stream.of(Gender.values())
                .filter(gender -> gender.getGender().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }


}
