package br.com.gitpackages.gitpackages.client;

import br.com.gitpackages.gitpackages.mapper.UserMapper;
import br.com.gitpackages.gitpackages.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponseClient {

  private String name;

  public User toModel() {
    return UserMapper.INSTANCE.mapResponseClientToModel(this);
  }
}
