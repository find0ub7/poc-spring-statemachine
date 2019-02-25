package poc.spring.state.machine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private StateMachine<OrderStates, OrderEvents> stateMachine;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        stateMachine.sendEvent(OrderEvents.PAYMENT_CONFIRMED);
        stateMachine.sendEvent(OrderEvents.INVOICE_ISSUED);
    }
}