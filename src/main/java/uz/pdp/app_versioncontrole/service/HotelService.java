package uz.pdp.app_versioncontrole.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.pdp.app_versioncontrole.entity.Hotel;
import uz.pdp.app_versioncontrole.entity.Room;
import uz.pdp.app_versioncontrole.repository.HotelRepository;
import uz.pdp.app_versioncontrole.repository.RoomRepository;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private HotelRepository hotelRepository;

    public List<Room> getRoomsByHotelId(Long hotelId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Room> roomPage = roomRepository.findRoomsByHotelId(hotelId, pageable);
        return roomPage.getContent();
    }

    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}