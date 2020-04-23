package chanbrightt.mission2.repository;
import chanbrightt.mission2.model.BurgerMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BurgerRepository extends JpaRepository<BurgerMenu, Integer> {
}
