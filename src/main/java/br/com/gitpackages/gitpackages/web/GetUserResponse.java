package br.com.gitpackages.gitpackages.web;

import br.com.gitpackages.gitpackages.mapper.UserMapper;
import br.com.gitpackages.gitpackages.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class GetUserResponse {

  private String name;

  public static GetUserResponse fromModel(User user) {
    return UserMapper.INSTANCE.mapModelToResponse(user);
  }
}
