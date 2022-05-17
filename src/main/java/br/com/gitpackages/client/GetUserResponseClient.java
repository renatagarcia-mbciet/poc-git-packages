package br.com.gitpackages.client;

import br.com.gitpackages.mapper.UserMapper;
import br.com.gitpackages.model.User;
import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class GetUserResponseClient {

  private String name;

  public User toModel() {
    return UserMapper.INSTANCE.mapResponseClientToModel(this);
  }
}
