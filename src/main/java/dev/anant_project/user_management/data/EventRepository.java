package dev.anant_project.user_management.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;@Repository
public interface EventRepository extends MongoRepository<Event, String> {}

