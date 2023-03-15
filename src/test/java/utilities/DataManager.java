package utilities;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.restassured.response.Response;
import pojo.User;

public class DataManager {

	// Data Manager
	private static DataManager dataManager;

	private DataManager() {
	};

	public static DataManager getInstance() {
		if (dataManager == null) {
			dataManager = new DataManager();
		}
		return dataManager;
	}

	public static void cleanUp() {
		if (dataManager != null) {
			dataManager = null;
		}
	}
}