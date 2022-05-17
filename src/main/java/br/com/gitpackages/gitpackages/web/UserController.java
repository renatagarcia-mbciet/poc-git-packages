package br.com.gitpackages.gitpackages.web;

import br.com.gitpackages.gitpackages.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService service;

  @GetMapping("/listAll")
  @ResponseStatus(HttpStatus.OK)
  public GetUserResponse listAll() {
    log.info("START - List");
    GetUserResponse response = GetUserResponse.fromModel(service.listAll());
    log.info("END - List");
    return response;
  }
}
