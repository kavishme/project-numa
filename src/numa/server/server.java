package numa.server;
import java.io.File;

public class MessageApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: Server <config file>");
			System.exit(1);
		}

		File cf = new File(args[0]);
		try {
			MessageReceiver rcv = new MessageReceiver(cf);
			MessageHandler handler = new MessageHandler();
			MessageQOS qos = new MessageQOS(handler);
			receiver.attachQOS(qos);
			receiver.startReceiving();

			// MessageServer svr = new MessageServer(cf);
			// svr.startServer();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Server closing");
		}
	}
}
