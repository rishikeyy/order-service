package kafka;

import jakarta.websocket.SendResult;
import org.springframework.kafka.core.KafkaTemplate;
import  java.util.*;


public class messageSender {

    private final KafkaTemplate kafkatemplate;

    public messageSender(KafkaTemplate kafkatemplate) {
        this.kafkatemplate = kafkatemplate;
    }

    public void sendMessage(String message) {
        CompletableFuture<SendResult<String, String>> future = kafkatemplate.send("Products", message);
        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + message +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" +
                        message + "] due to : " + ex.getMessage());
            }
        });
    }
}
