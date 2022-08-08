package FoodMaker.app.Listeners;

import FoodMaker.app.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {

    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}
