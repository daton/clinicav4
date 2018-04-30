package org.unitec.clinicav4;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepoMongo extends ReactiveMongoRepository<Mensaje, String> {
}
