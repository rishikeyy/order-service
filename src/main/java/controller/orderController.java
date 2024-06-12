package controller;


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
    ResponseEntity<order>createNewOrder(@RequestBody List<product>products){
        //make order object from products
        //-------

        //also update the Gadgets quantity  in the Gadget DB

        return ResponseEntity.ok(orderservice.save(products));//confused abt. parameter
}

}
