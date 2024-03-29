package com.cjuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cjuegos.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

	Player findBottomByOrderByQuestionsDesc();
}
