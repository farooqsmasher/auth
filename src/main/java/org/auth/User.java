package org.auth;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {




    private  String userName;
    private String password;

}
