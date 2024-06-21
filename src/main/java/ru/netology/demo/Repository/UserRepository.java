package ru.netology.demo.Repository;

import org.springframework.stereotype.Repository;
import ru.netology.demo.Controller.Authorities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private final Map<String, String> users = new HashMap<>();
    private final Map<String, List<Authorities>> authorities = new HashMap<>();

    public UserRepository() {

        users.put("Daniil", "netology");
        authorities.put("Daniil", List.of(Authorities.READ, Authorities.WRITE));

        users.put("Vasya", "Blabla");
        authorities.put("Vasya", List.of(Authorities.READ));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (users.containsKey(user) && users.get(user).equals(password)) {
            return authorities.get(user);
        }
        return List.of();
    }
}
