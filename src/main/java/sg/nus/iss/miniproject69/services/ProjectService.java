package sg.nus.iss.miniproject69.services;


import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Objects;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;





@Service
public class ProjectService {
    private static final String API_URL = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/findByIngredients";

    //implement api key requirement
    @Value("API_KEY")
    private String apiKey;

    //make something like a key prompt, might remove later if I it hinders code
    @PostConstruct
	public void keyPrompt() {
		if (Objects.isNull(apiKey))
			System.err.println("API KEY?");
	}
  
    




    
    
}
