package kastourik12.Eventcatalogservice.service;

import kastourik12.Eventcatalogservice.model.EventCatalog;
import kastourik12.Eventcatalogservice.repository.EventCatalogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventCatalogService {
    private final EventCatalogRepository eventCatalogRepository;

    public List<EventCatalog> getEventCatalogByName(String name) {
        return eventCatalogRepository.findByName(name);
    }
}
