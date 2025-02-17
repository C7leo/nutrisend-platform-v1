package com.example.nutrisend.platform.meals.domain.services;

import com.example.nutrisend.platform.meals.domain.model.aggregates.TypeMeals;
import com.example.nutrisend.platform.meals.domain.model.queries.GetAllTypeMealsQuery;
import com.example.nutrisend.platform.meals.domain.model.queries.GetTypeMealsByIdQuery;

import java.util.List;
import java.util.Optional;

public interface TypeMealsQueryService {
    List<TypeMeals> handle(GetAllTypeMealsQuery query);
    Optional<TypeMeals> handle(GetTypeMealsByIdQuery query);
}
