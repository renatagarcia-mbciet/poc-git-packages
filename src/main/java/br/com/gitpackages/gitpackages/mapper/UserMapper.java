package br.com.gitpackages.gitpackages.mapper;

import br.com.gitpackages.gitpackages.client.GetUserResponseClient;
import br.com.gitpackages.gitpackages.model.User;
import br.com.gitpackages.gitpackages.web.GetUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  GetUserResponse mapModelToResponse(User model);

  User mapResponseClientToModel(GetUserResponseClient response);
}
