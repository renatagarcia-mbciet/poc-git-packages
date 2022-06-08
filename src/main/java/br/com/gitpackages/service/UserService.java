package br.com.gitpackages.service;

import br.com.gitpackages.client.GetUserResponseClient;
import br.com.gitpackages.client.GitPackagesClient;
import br.com.gitpackages.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final GitPackagesClient client;

  public User listAll() {
    // TODO Criar Server MOCK
    //  client.listAllUsers().toModel()

    GetUserResponseClient response = new GetUserResponseClient();
    response.setName("Renata");
    response.setIdent("2331sdasc1231");
    return response.toModel();
  }
}
