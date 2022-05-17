package br.com.gitpackages.templates;

import br.com.gitpackages.client.GetUserResponseClient;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class UserTemplate implements TemplateLoader {
  @Override
  public void load() {
    Fixture.of(GetUserResponseClient.class)
        .addTemplate(
            "valid",
            new Rule() {
              {
                add("name", "Teste");
              }
            });
  }
}
