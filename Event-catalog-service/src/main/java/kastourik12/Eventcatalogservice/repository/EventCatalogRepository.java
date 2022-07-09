package kastourik12.Eventcatalogservice.repository;

import kastourik12.Eventcatalogservice.model.EventCatalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventCatalogRepository extends MongoRepository<EventCatalog, String> {

    List<EventCatalog> findByName(String name);
}
