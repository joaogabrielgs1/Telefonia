package ifsuldeminas.bbc.Telefonia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class teste {
    @GetMapping("/intro")
    public String intro(){
        return "introducao ao git e github";
    }
}
