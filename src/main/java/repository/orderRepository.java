package repository;
import model.order;
import model.orderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepository extends JpaRepository<orderDTO,Integer> {
}
