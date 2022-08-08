package FoodMaker.app.Listeners;

import java.util.List;

import FoodMaker.app.Models.SimilarRecipeResponse;

public interface SimilarRecipesListener {

    void didFetch(List<SimilarRecipeResponse> response, String message);
    void didError(String message);
}
