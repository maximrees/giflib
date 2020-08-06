package edu.max.giflib.Controller;

import edu.max.giflib.Data.GifRepository;
import edu.max.giflib.Model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepo;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepo.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "Home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepo.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
