package dev.pedrodias.santander_bootcamp.service;

import dev.pedrodias.santander_bootcamp.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User finbById(Long id);

    User create(User userToCreate);
}
