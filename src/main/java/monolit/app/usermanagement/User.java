package monolit.app.usermanagement;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

  private Long id;
  private String email;
}
