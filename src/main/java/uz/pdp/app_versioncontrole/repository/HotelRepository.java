package uz.pdp.app_versioncontrole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.app_versioncontrole.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}

