package uz.pdp.app_versioncontrole.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private int floor;
    private double size;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

}
