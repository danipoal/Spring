package Auth;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

//Todo lo que vaya en ruta /auth sera gestionada por esta clase
@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class AuthController {
    
    //Gestionado por la ruta auth/login
    @PostMapping(value= "login")
    public String login(){

        return "login from public endpoint";
    }

    @PostMapping(value="register")
    public String register(){

        return "Register from public endpoint";
    }
}
