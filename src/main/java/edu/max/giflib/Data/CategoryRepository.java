package edu.max.giflib.Data;

import edu.max.giflib.Model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    public static List<Category> ALL_CATEGORIES;


    public CategoryRepository(){
        this.ALL_CATEGORIES = Arrays.asList(new Category(1, "funny"), new Category(2, "stupid"), new Category(3, "bleh"));
    }

    public Category findById(int id){
        for(Category category : ALL_CATEGORIES){
            if(category.getId()==id){
                return category;
            }
        }
        return null;
    }

    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
}
