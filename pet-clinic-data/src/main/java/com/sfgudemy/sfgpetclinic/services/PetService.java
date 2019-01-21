package com.sfgudemy.sfgpetclinic.services;

import com.sfgudemy.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
