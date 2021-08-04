package com.ftrack.Ftrack;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoordinatesReceiver {

    private final CoordinatesTools cTools;

    CoordinatesReceiver(CoordinatesTools cTools) {
        this.cTools = cTools;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/coordinates")
    List<Coordinates> all() {
        return cTools.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/coordinates")
    Coordinates newCoordinates(@RequestBody Coordinates newCoordinates) {
        return cTools.save(newCoordinates);
    }
    // Single item

    @GetMapping("/coordinates/{id}")
    Coordinates one(@PathVariable Long id) {
        return cTools.findById(id)
                .orElseThrow(() -> new CoordinatesNotFoundException(id));
    }
    @GetMapping("/coordinates/last")
    Coordinates last() {

        return cTools.findById(cTools.count())
                .orElseThrow(() -> new CoordinatesNotFoundException(cTools.count()));
    }

/*  @PutMapping("/coordinates/{id}")
    Coordinates replaceEmployee(@RequestBody Coordinates newCoordinates, @PathVariable Long id) {

        return cTools.findById(id)
                .map(employee -> {
                    employee.setLatitude(newCoordinates.getLatitude());
                    employee.setLongitude(newCoordinates.getLongitude());
                    return cTools.save(employee);
                })
                .orElseGet(() -> {
                    newCoordinates.setId(id);
                    return cTools.save(newCoordinates);
                });
    }*/

/*  @DeleteMapping("/coordinates/{id}")
    void deleteEmployee(@PathVariable Long id) {
        cTools.deleteById(id);
    }*/
}
