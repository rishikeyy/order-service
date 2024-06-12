package service;

import org.springframework.stereotype.Service;
import repository.orderRepository;
import model.order;
import java.util.List;

@Service
public class orderService {
    private final orderRepository orderrepository;

    public orderService(orderRepository orderrepository) {
        this.orderrepository = orderrepository;
    }

    public List<order> findAll(){
        return (List<order>)orderrepository.findAll();
    }

    public order save(order orderNew){
        return orderrepository.save(orderNew);
    }


}
