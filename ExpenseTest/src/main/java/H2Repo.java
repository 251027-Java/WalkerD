import java.sql.*;
import java.util.List;

public class H2Repo implements Repository{

    // Fields
    private Connection connect;
    private static final String H2_URL = "jdbc:h2:mem:expenses;DB_CLOSE_DELAY=-1";

    // Constructor
    public H2Repo() {
        try {
            connect = DriverManager.getConnection(H2_URL);
            try (Statement statement = connect.createStatement()) {
                String sql = "CREATE SCHEMA IF NOT EXISTS ExpenseReport;" +
                        "CREATE TABLE IF NOT EXISTS ExpenseReport.Expenses (" +
                        "id INT PRIMARY KEY," +
                        "date TIMESTAMP NOT NULL," +
                        "price FLOAT CHECK (price > 0)," +
                        "merchant VARCHAR(50) NOT NULL" +
                        ");";
                statement.execute(sql);
                System.out.println("Successful creation of H2 database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Methods

    @Override
    public void createExpense(Expense expense) {
        String sql = "INSERT INTO ExpenseReport.Expenses (id, date, price, merchant) Values (?, ?, ?, ?);";
        try (PreparedStatement preparedStatement = connect.prepareStatement(sql)){
            preparedStatement.setInt(1, expense.getId());
            preparedStatement.setDate(2, new java.sql.Date(expense.getDate().getTime()));
            preparedStatement.setDouble(3, expense.getValue());
            preparedStatement.setString(4, expense.getMerchant());
            preparedStatement.execute();
            System.out.println("Expense created successfully!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Expense readExpense(int id) {
        return null;
    }

    @Override
    public void updateExpense(Expense expense) {

    }

    @Override
    public void deleteExpense(int id) {
        // DELETE FROM x WHERE y --> delete command
        // DELETE FROM ExpenseReport.Expenses WHERE id=id --> command that will be executed
        String sql = "DELETE FROM ExpenseReport.Expenses WHERE id=?;";
        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int row = stmt.executeUpdate();
            if(row > 0){
                System.out.println("Expense ID "+ id +" deleted successfully");
            } else {
                System.out.println("Expense ID doesn't exist");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Expense> loadExpenses() {
        return List.of();
    }

    @Override
    public void saveExpenses(List<Expense> expenses) {

    }


}
