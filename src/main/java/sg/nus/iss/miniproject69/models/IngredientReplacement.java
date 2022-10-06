package sg.nus.iss.miniproject69.models;

public class IngredientReplacement {
    private Boolean status;
    private String ingredient;
    private String subtitutes;
    private String message;

    
    public IngredientReplacement(Boolean status, String ingredient, String subtitutes, String message) {
        this.status = status;
        this.ingredient = ingredient;
        this.subtitutes = subtitutes;
        this.message = message;
    }
    
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getIngredient() {
        return ingredient;
    }
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
    public String getSubtitutes() {
        return subtitutes;
    }
    public void setSubtitutes(String subtitutes) {
        this.subtitutes = subtitutes;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
}
