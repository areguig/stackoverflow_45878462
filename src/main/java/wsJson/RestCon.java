package wsJson;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestCon {

  private AtomicLong id;

  public Bean b;
  @RequestMapping("/bean")
  public Bean getBeans(@RequestParam(value="name")String name){
    return new Bean(id.incrementAndGet(), name);

  }

}