package br.com.gitpackages;

import br.com.gitpackages.gitpackages.client.GetUserResponseClient;
import br.com.gitpackages.gitpackages.mapper.UserMapper;
import br.com.gitpackages.util.UnitTest;
import br.com.six2six.fixturefactory.Fixture;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UserResponseMapperTest extends UnitTest {

  @Test
  public void testQuoteResponse() {
    GetUserResponseClient useresponse = Fixture.from(GetUserResponseClient.class).gimme("valid");
    var response = UserMapper.INSTANCE.mapResponseClientToModel(useresponse);

    Assertions.assertThat(response).isNotNull();
    Assertions.assertThat(response.getName()).isEqualTo(useresponse.getName());
  }
}
