package helpdesk.helpdesk;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @RequestMapping("/chamado")
    public Greeting greeting() {
        return new Greeting(1,"chamado");
    }
}
