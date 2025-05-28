package com.example.demo.contoroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AlbumService;
import com.example.demo.service.MusicService;

import com.example.demo.model.AlbumViewModel;
import com.example.demo.model.AlbumForm;

@RestController
@RequestMapping("/albums")
public class controller {
    // private final String Albumservice = albumservice;
    // private final String Musicservice = musicservice;

    // public controller(String Albumservice, String Musicservice) {
    // this.albumservice = Albumservice;
    // this.musicservice = Musicservice;
    // }

    // @GetMapping
    // public String albums(@RequestParam(defaultValue = "") String title, Model
    // model) {
    // List<AlbumViewModel> albums = title.isEmpty() ?
    // albumservice.getAllAlbumsWithMusicCount()
    // : albumservice.getAllAlbumsWithMusicCountByKeyword(title);
    // model.addAttribute("albums", albums);
    // model.addAttribute("title", title);
    // return "albums/album-list";
    // }

    @GetMapping("/new")
    public String hello() {
        return "Hello, World!";
    }

    // @PostMapping("/new")
    // public String createAlbum(AlbumForm albumForm) {
    // albumservice.createAlbum(albumForm);
    // return "redirect:/albums";
    // }
}
