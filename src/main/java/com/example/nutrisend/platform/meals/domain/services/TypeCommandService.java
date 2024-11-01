package com.example.nutrisend.platform.meals.domain.services;

import com.example.nutrisend.platform.meals.domain.model.aggregates.Meals;
import com.example.nutrisend.platform.meals.domain.model.commands.CreateCategoryMealsCommand;
import java.util.Optional;

public interface TypeCommandService {
    Optional<Meals> handle(CreateCategoryMealsCommand command);
}
