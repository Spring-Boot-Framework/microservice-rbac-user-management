package com.giassi.microservice.demo2.rest.user;

import lombok.Data;

@Data
public class RestUserDTO {

    private String username;
    private String name;
    private String surname;
    private String email;
    private boolean enabled;
    private String gender;

}
