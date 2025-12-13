package webcrud_app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import webcrud_app.repository.PlayerRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import webcrud_app.Player;

@Controller
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/")
    public String listPlayers(Model model) {
        model.addAttribute("players", playerRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String showAddForm(Player player){
        return "add-player";
    }

    @PostMapping("/add")
    public String addPlayer(Player player) {
        playerRepository.save(player);
        return "redirect:/";
    }

}
