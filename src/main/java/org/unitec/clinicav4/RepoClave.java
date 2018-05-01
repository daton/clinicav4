package org.unitec.clinicav4;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepoClave extends ReactiveMongoRepository<Clave, String> {
}
