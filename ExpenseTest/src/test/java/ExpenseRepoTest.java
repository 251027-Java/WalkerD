import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class ExpenseRepoTest {

    @Test
    public void testGetID(){
        Repository repo1 = new TextRepo();
        Repository repo2 = new JSONRepo();
        Repository repo3 = new CSVRepo();

        RepoService service1 = new RepoService(repo1);
        RepoService service2 = new RepoService(repo2);
        RepoService service3 = new RepoService(repo3);

        Expense result1 = service1.getExpense(10);
        Expense result2 = service2.getExpense(99);
        Expense result3 = service3.getExpense(30);

        Assertions.assertNull(result1);
        Assertions.assertNull(result2);
        Assertions.assertNull(result3);
    }

    @Test
    public void testDeleteExpense() {
        Repository repo1 = new TextRepo();
        Repository repo2 = new JSONRepo();
        Repository repo3 = new CSVRepo();

        RepoService service1 = new RepoService(repo1);
        RepoService service2 = new RepoService(repo2);
        RepoService service3 = new RepoService(repo3);

        boolean result1 = service1.deleteExpense(10);
        boolean result2 = service2.deleteExpense(1);
        boolean result3 = service3.deleteExpense(70);

        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);
        Assertions.assertFalse(result3);

    }

    @Test
    public void testSumExpenses(){
        Repository repo = new TextRepo();
        RepoService repoService = new RepoService(repo);

        // Capture System.out
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        repoService.sumExpenses();

        // Restore original System.out
        System.setOut(System.out);

        String printed = output.toString().trim();
        Assertions.assertFalse(printed.contains("20405.98"));
    }

    @Test
    public void testExpenseCreation(){
        Expense exp = new Expense(20, new Date(), 9.99, "Rev");

        Assertions.assertEquals(20, exp.getId());
        Assertions.assertEquals(9.99, exp.getValue(), 0.01);
    }








}
