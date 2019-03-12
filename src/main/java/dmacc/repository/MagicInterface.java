package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.MagicCards;

@Repository
public interface MagicInterface extends JpaRepository<MagicCards, Long> {
	
}
