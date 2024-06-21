package controller;


import model.orderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.orderService;
import model.order;
import model.product;

import java.util.List;

@RestController("/orders")
public class orderController {
    private final orderService orderservice;

    public orderController(orderService orderservice) {
        this.orderservice = orderservice;
    }

@GetMapping
    ResponseEntity<List<order>>orders(){
        return ResponseEntity.ok(orderservice.findAll());
}

@PostMapping("/create")
    ResponseEntity<order>createNewOrder(@RequestBody orderDTO products){

        // update the Gadgets quantity ->put in Products topic->Gadgets and Invetntory will consume the messages

        orderservice.sendmessage();

        return ResponseEntity.ok(orderservice.save(products));//confused abt. parameter
}

}
