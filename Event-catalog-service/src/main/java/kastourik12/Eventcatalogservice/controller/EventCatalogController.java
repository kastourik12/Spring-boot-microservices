package kastourik12.Eventcatalogservice.controller;

import kastourik12.Eventcatalogservice.model.EventCatalog;
import kastourik12.Eventcatalogservice.service.EventCatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event-catalog")
@RequiredArgsConstructor
public class EventCatalogController {
    private final EventCatalogService eventCatalogService;
    public List<EventCatalog> getEventCatalogByName(String name) {
        return eventCatalogService.getEventCatalogByName(name);
    }
}
