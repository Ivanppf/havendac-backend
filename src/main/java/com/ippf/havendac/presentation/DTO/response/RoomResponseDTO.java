package com.ippf.havendac.presentation.DTO.response;

import com.ippf.havendac.model.entities.Room;

public record RoomResponseDTO(
        Integer id,
        Float length,
        Float width,
        Float area,
        Integer propertyId
) {
    public RoomResponseDTO(Room room) {
        this(room.getId(), room.getLength(), room.getWidth(), room.getArea(), room.getProperty().getId());
    }
}
