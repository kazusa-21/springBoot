
package com.example.demo.controller;

import com.example.demo.model.Hotel;
import com.example.demo.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CafeController {
    private final HotelService hotelService;

    public CafeController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/search")
    public String searchHotels(@RequestParam("keyword") String keyword, Model model) {
        List<Hotel> hotels = hotelService.searchByKeyword(keyword);
        model.addAttribute("hotels", hotels);
        return "searchresult";
    }

    @GetMapping("/member")
    public String showSearchForm() {
        return "memberresult";
    }

    @GetMapping("/top")
    public String showTopPage() {
        // templates/カフェ.html を表示
        return "top"; // 拡張子「.html」は不要
    }

    @PostMapping("/member")
    public String receiveMember(@RequestParam("username") String username, Model model) {
        model.addAttribute("name", username);
        return "memberresult"; // templates/member.html を返す
    }
}
