package org.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@RequestMapping("/auth")
public class WelcomeController {

    @GetMapping("/test")
    public HashMap<Integer,String> demo(){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"farooq");
        return map;
    }


}
