package com.udemy.sfg.recipeapp.services.impl;

import com.udemy.sfg.recipeapp.services.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class ImageServiceImpl implements ImageService {
    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {
        log.warn("Image received for recipe {} ", recipeId);
    }
}
