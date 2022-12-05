package baemindelivery.domain;

import baemindelivery.주문Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Integer productId;
    
    
    
    
    
    private Integer qty;


    public static OrderRepository repository(){
        OrderRepository orderRepository = 주문Application.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
