import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    static void main() throws IOException {
        System.out.println("Expense Tracker Starting...");
////        List<Expense> expenses = new ArrayList<Expense>();
//
//        // THIS is where we switch our repository from one to another
////        IRepository repo = new TextRepository();
////        IRepository repo = new CSVRepository();
        // Repository repo = new JSONRepo();
        Repository repo = new H2Repo();

//
////        System.out.println("Creating a test expense:");
////        expenses.add(new Expense(1, new Date(), 99.95, "Walmart"));
////        expenses.add(new Expense(2, new Date(), 85.75, "Costco"));
////        expenses.add(new Expense(3, new Date(), 10000, "Private Jet"));
////        repo.saveExpenses(expenses);
//
////        System.out.println("Loading saved expenses...");
////        expenses = repo.loadExpenses();
////        System.out.println(expenses);
//
        RepoService service = new RepoService(repo);
        //service.createNewExpense(1, 99.95, "Walmart");
        // service.createNewExpense(2,10.90,"costco");
        //service.deleteExpense(2);
//        service.createNewExpense(3,10.70,"target");
//        service.deleteExpense(3);
        service.createNewExpense(4,67.41,"bucees");
        service.deleteExpense(4);

//        service.sumExpenses();
//        service.printExpenses();



        System.out.println("Expense Tracker Closing...");

    }
}
