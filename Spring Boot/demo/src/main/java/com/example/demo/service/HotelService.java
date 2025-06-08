package com.example.demo.service;

import com.example.demo.mapper.HotelMapper;
import com.example.demo.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    private final HotelMapper hotelMapper;

    public HotelService(HotelMapper hotelMapper) {
        this.hotelMapper = hotelMapper;
    }

    public List<Hotel> searchByKeyword(String keyword) {
        return hotelMapper.findByKeyword(keyword);
    }
}