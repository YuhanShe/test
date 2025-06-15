import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecipeDAO {
    public List<String> getAllRecipeNames() {
        List<String> recipes = new ArrayList<>();
        try (Connection conn = DatabaseConnector.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT name FROM recipes")) {
            while (rs.next()) {
                recipes.add(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recipes;
    }
}


