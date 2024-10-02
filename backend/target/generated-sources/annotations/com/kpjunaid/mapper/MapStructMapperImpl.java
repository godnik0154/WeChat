package com.kpjunaid.mapper;

import com.kpjunaid.dto.UpdateUserInfoDto;
import com.kpjunaid.entity.User;
import com.kpjunaid.entity.User.UserBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-02T10:21:23+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public User userUpdateDtoToUser(UpdateUserInfoDto updateUserInfoDto) {
        if ( updateUserInfoDto == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        if ( updateUserInfoDto.getBirthDate() != null ) {
            user.birthDate( updateUserInfoDto.getBirthDate() );
        }
        if ( updateUserInfoDto.getCurrentCity() != null ) {
            user.currentCity( updateUserInfoDto.getCurrentCity() );
        }
        if ( updateUserInfoDto.getEduInstitution() != null ) {
            user.eduInstitution( updateUserInfoDto.getEduInstitution() );
        }
        if ( updateUserInfoDto.getFirstName() != null ) {
            user.firstName( updateUserInfoDto.getFirstName() );
        }
        if ( updateUserInfoDto.getGender() != null ) {
            user.gender( updateUserInfoDto.getGender() );
        }
        if ( updateUserInfoDto.getHometown() != null ) {
            user.hometown( updateUserInfoDto.getHometown() );
        }
        if ( updateUserInfoDto.getIntro() != null ) {
            user.intro( updateUserInfoDto.getIntro() );
        }
        if ( updateUserInfoDto.getLastName() != null ) {
            user.lastName( updateUserInfoDto.getLastName() );
        }
        if ( updateUserInfoDto.getWorkplace() != null ) {
            user.workplace( updateUserInfoDto.getWorkplace() );
        }

        return user.build();
    }
}
