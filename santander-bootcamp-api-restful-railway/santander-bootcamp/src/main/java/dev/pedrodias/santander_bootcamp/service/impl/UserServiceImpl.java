package dev.pedrodias.santander_bootcamp.service.impl;

import dev.pedrodias.santander_bootcamp.domain.model.User;
import dev.pedrodias.santander_bootcamp.repository.UserRepository;
import dev.pedrodias.santander_bootcamp.service.UserService;

import java.util.NoSuchElementException;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User finbById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
