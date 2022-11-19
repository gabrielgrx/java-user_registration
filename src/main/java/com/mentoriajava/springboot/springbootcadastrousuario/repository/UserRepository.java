package com.mentoriajava.springboot.springbootcadastrousuario.repository;

import com.mentoriajava.springboot.springbootcadastrousuario.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    boolean existsByCpf(String cpf);
    boolean existsByPhone(String phone);
    boolean existsByEmail(String email);
}
