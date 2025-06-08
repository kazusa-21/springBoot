package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.example.demo.model.Hotel;
import com.example.demo.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/cafe")
    public String showCafePage() {
        // templates/カフェ.html を表示
        return "カフェ"; // 拡張子「.html」は不要
    }

    @GetMapping("/top")
    public String showTopPage() {
        // templates/カフェ.html を表示
        return "top"; // 拡張子「.html」は不要
    }

    @GetMapping("/member")
    public String showMemberForm() {
        return "memberform"; // 名前入力フォーム
    }

    @PostMapping("/member")
    public String receiveMember(@RequestParam("username") String username, Model model) {
        model.addAttribute("name", username);
        return "memberresult"; // templates/member.html を返す
    }

}
