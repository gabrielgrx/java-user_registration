package com.mentoriajava.springboot.springbootcadastrousuario.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private String birthDate;
    @NotBlank
    private String address;
    @NotBlank
    private String addressNumber;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    private String country;
    @NotBlank
    private String zipCode;
    @NotBlank
    private String phone;
    @NotBlank
    private String email;
}
