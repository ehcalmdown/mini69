package sg.nus.iss.miniproject69.models;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class IngredientRecette {
    private String recetteId;
    private String recetteTitle;
    private String image;
    private String ingredientCount;
    private String likes;
    
    public String getRecetteId() {
        return recetteId;
    }

    public void setRecetteId(String recetteId) {
        this.recetteId = recetteId;
    }

    public String getRecetteTitle() {
        return recetteTitle;
    }

    public void setRecetteTitle(String recetteTitle) {
        this.recetteTitle = recetteTitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIngredientCount() {
        return ingredientCount;
    }

    public void setIngredientCount(String ingredientCount) {
        this.ingredientCount = ingredientCount;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public IngredientRecette(String recetteId, String recetteTitle, String image, String ingredientCount,
            String likes) {
        this.recetteId = recetteId;
        this.recetteTitle = recetteTitle;
        this.image = image;
        this.ingredientCount = ingredientCount;
        this.likes = likes;
    }

    //convert model into jsonObject
    public JsonObject toJson(){
        return Json.createObjectBuilder()
                .add("recetteId", recetteId)
                .add("recetteTitle", recetteTitle)
                .add("image", image)
                .add("ingredientCount", ingredientCount)
                .add("likes", likes)
                .build();
    }
}


