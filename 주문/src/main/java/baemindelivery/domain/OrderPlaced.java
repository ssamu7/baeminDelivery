package baemindelivery.domain;

import baemindelivery.domain.*;
import baemindelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;

    public OrderPlaced(){
        super();
    }
}
