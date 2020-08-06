package edu.max.giflib.Controller;

import edu.max.giflib.Data.CategoryRepository;
import edu.max.giflib.Data.GifRepository;
import edu.max.giflib.Model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository mCategoryRepository;
    @Autowired
    private GifRepository mGifRepository;


    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap){
        modelMap.put("categories", mCategoryRepository.getAllCategories());
        return "categories";
    }


    @RequestMapping("/category/{categoryId}")
    public String listDetailCategory(@PathVariable int categoryId, ModelMap modelMap){
        modelMap.put("category", mCategoryRepository.findById(categoryId) );
        modelMap.put("gifs", mGifRepository.getAllGifsOfCategory(categoryId));
        return "category";
    }

}
