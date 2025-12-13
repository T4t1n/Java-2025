package webcrud_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webcrud_app.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
