package uz.pdp.app_versioncontrole.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.app_versioncontrole.entity.Hotel;
import uz.pdp.app_versioncontrole.entity.Room;
import uz.pdp.app_versioncontrole.service.HotelService;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class RoomController {
    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @Autowired
    private HotelService hotelService;

    @GetMapping("/{hotelId}/rooms")
    public List<Room> getRooms(@PathVariable Long hotelId,
                               @RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size) {
        return hotelService.getRoomsByHotelId(hotelId, page, size);
    }
}

