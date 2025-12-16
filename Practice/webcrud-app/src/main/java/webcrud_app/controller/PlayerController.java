package webcrud_app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import webcrud_app.repository.PlayerRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import webcrud_app.Player;
import org.springframework.web.bind.annotation.PathVariable;

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


    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model){
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid player Id: " + id));
        model.addAttribute("player", player);
        return "update-item";
    }

    @PostMapping("/update/{id}")
    public String updatePlayer(@PathVariable("id") long id, Player player) {
        player.setId(id);
        playerRepository.save(player);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteItem(@PathVariable("id") long id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid player id: " + id));
        playerRepository.delete(player);
        return "redirect:/";
    }
}
