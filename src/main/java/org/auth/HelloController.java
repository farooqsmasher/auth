package org.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class HelloController {

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    AuthenticationManager authenticationManager;


    @GetMapping("/hello")
    public String hello(){
        return "demo microservices";
    }

    @PostMapping("/autheticate")
    public String generateToken(@RequestBody Auth auth ){
      try {
          authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(auth.getUserName(),auth.getPassword()));
      }catch (Exception e){

      }
return jwtUtil.generateToken(auth.getUserName());
    }

}
