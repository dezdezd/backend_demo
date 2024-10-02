package smkt.backend_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody AppUser appUser) {
        userRepository.save(appUser);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/all")
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }
}

