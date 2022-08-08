package FoodMaker.app.Listeners;

import java.util.List;

import FoodMaker.app.Models.InstructionsResponse;

public interface InstructionsListener {
    void didFetch(List<InstructionsResponse> response, String message);
    void didError(String message);
}
