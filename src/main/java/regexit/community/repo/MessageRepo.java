package regexit.community.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import regexit.community.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
