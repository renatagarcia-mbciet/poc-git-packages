package br.com.gitpackages.mapper;

import br.com.gitpackages.client.GetUserResponseClient;
import br.com.gitpackages.model.User;
import br.com.gitpackages.model.User.UserBuilder;
import br.com.gitpackages.web.GetUserResponse;
import br.com.gitpackages.web.GetUserResponse.GetUserResponseBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-13T14:58:48-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.jar, environment: Java 14.0.2 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public GetUserResponse mapModelToResponse(User model) {
        if ( model == null ) {
            return null;
        }

        GetUserResponseBuilder getUserResponse = GetUserResponse.builder();

        getUserResponse.name( model.getName() );

        return getUserResponse.build();
    }

    @Override
    public User mapResponseClientToModel(GetUserResponseClient response) {
        if ( response == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.name( response.getName() );

        return user.build();
    }
}
