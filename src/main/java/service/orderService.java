package service;

import kafka.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.orderRepository;
import model.order;
import java.util.List;
import model.orderDTO;
import RestClientBuilder.RestClientmy;


@Service
public class orderService {
    private final orderRepository orderrepository;
    private  final MessageProducer messageProducer;

    @Autowired
    private final RestClientmy restclient;
    public orderService(orderRepository orderrepository, MessageProducer messagesender) {
        this.orderrepository = orderrepository;
        this.messageProducer = messagesender;
    }

    public List<order> findAll(){
        return (List<order>)orderrepository.findAll();
    }

    public void sendMessage(String msg){
        messageProducer.sendMessage("Products",msg);
    }

    public order save(orderDTO orderNew){


        return orderrepository.save(orderNew);
    }


}
