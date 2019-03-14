package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.services.ImageService;
import com.udemy.sfg.recipeapp.services.RecipeCommandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageController {

    private final RecipeCommandService recipeCommandService;
    private final ImageService imageService;

    public ImageController(RecipeCommandService recipeCommandService, ImageService imageService) {
        this.recipeCommandService = recipeCommandService;
        this.imageService = imageService;
    }

    @GetMapping("recipe/{id}/image")
    public String showUploadForm(@PathVariable String id, Model model){
        model.addAttribute("recipe", recipeCommandService.findRecipeCommandById(Long.valueOf(id)));

        return "recipe/imageuploadform";
    }

    @PostMapping("recipe/{id}/image")
    public String handleImagePost(@PathVariable String id, @RequestParam("imagefile") MultipartFile file){

        imageService.saveImageFile(Long.valueOf(id), file);

        return "redirect:/recipe/" + id + "/show";
    }
}
