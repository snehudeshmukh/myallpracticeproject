package dailypractice;
import java.io.IOException;
import java.io.FileReader;
import java.sql.SQLException;

public class TestTry {
	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader( "");
			throw new SQLException();
		}
		catch(SQLException|IOException|ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
