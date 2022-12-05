package baemindelivery.domain;

import baemindelivery.domain.*;
import baemindelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}


