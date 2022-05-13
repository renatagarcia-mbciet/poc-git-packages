package br.com.gitpackages.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "gitpackages", url = "${app.integration.service.url}")
public interface GitPackagesClient {

  @GetMapping("/service/feign/")
  GetUserResponseClient listAllUsers();
}
