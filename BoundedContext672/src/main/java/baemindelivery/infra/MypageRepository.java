package baemindelivery.infra;

import baemindelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="mypages", path="mypages")
public interface MypageRepository extends PagingAndSortingRepository<Mypage, Long> {

    

    
}