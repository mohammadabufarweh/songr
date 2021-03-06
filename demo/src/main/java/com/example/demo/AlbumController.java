package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Controller
public class AlbumController {
    @GetMapping("/hello")
    @ResponseBody
    public String getHello() {
        return "Hello World";
    }
    @GetMapping("/hello/{word}")

    public String getCapitalize(Model model, @PathVariable String word){
        model.addAttribute("word", word.toUpperCase());
      return "capitalize.html";
    }
    @GetMapping("/albums")
    public String getAlbum(Model model){

        Album album1 = new Album("Hello", "amrdiab",14,250,"https://i.ytimg.com/vi/3NhXB2y0Mvc/maxresdefault.jpg");
        Album album2 = new Album("World", "kathemLsaher",55,440,"https://i.ytimg.com/vi/3NhXB2y0Mvc/maxresdefault.jpg");
        Album album3 = new Album("Again", "assalah",87,450,"https://i.ytimg.com/vi/3NhXB2y0Mvc/maxresdefault.jpg");

        List<Album> albums = new ArrayList<Album>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        model.addAttribute("albums",albums);

        return "albumHtml.html";
    }

}
