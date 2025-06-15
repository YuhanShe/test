public class Main {
    public static void main(String[] args) {
        RecipeDAO dao = new RecipeDAO();
        System.out.println("All recipes in DB:");
        for (String name : dao.getAllRecipeNames()) {
            System.out.println(" - " + name);
        }
    }
}
