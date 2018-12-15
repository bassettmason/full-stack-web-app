package com.bassettmason.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    private albumRepository albumRepo;

    @RequestMapping(value="/albums", method=RequestMethod.GET)
    public String index(Model m) {
        // grab all the albums from the database
//        Album[] albums = new Album[]{
////                new Album("Peaches", "Mason Bassett", 14, 156, "url Peaches"),
////                new Album("For Me", "Mason Bassett", 15, 166, "url For Me")
////        };
        // display them on a page
        m.addAttribute("albums", albumRepo.findAll());
        return "albumIndex";
    }

    @RequestMapping(value="/album", method=RequestMethod.POST)
    public RedirectView create(
            @RequestParam String title,
            @RequestParam String artist,
            @RequestParam int songCount,
            @RequestParam int length,
            @RequestParam String imageURL) {
        Album newAlbum = new Album(title, artist, songCount, length, imageURL);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }
}
