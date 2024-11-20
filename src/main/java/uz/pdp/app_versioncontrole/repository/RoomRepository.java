package uz.pdp.app_versioncontrole.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import uz.pdp.app_versioncontrole.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Page<Room> findRoomsByHotelId(@Param("hotel_Id") Long hotelId, Pageable pageable);
}