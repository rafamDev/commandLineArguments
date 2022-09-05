package commandLineArguments;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyCommandLineArguments {
	private static final Logger LOG = Logger.getLogger(MyCommandLineArguments.class.getName());

	public static void main(String[] myArgs) {
		String oneMoreArgument[] = new String[myArgs.length + 1];
		for (int i = 0; i < oneMoreArgument.length; i++) {
			try {
				System.out.println(String.format("Command Line Argument %d is %s %n", i, myArgs[i]));
			} catch (ArrayIndexOutOfBoundsException e) {
				LOG.log(Level.WARNING, String.format("%s %n", e.getMessage()));
				LOG.log(Level.WARNING, String.format("%s %n", "Check the args set in the run configuration"));
			}
		}
		System.out.print(
				String.format("%s %n", "please do not forget to share it if you found it interesting".toUpperCase()));
	}
}
