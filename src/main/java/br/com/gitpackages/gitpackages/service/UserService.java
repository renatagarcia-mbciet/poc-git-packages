package br.com.gitpackages.gitpackages.service;

import br.com.gitpackages.gitpackages.client.GetUserResponseClient;
import br.com.gitpackages.gitpackages.client.GitPackagesClient;
import br.com.gitpackages.gitpackages.model.User;
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
    return response.toModel();
  }
}
