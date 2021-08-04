package com.ftrack.Ftrack;

class CoordinatesNotFoundException extends RuntimeException {
    CoordinatesNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
