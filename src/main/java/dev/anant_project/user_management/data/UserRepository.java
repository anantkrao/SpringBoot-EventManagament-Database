package dev.anant_project.user_management.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;@Repository
public interface UserRepository extends MongoRepository<User, String> {}
