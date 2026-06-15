package com.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public ConfigReader() {

		prop = new Properties();

		try {

			FileInputStream fis =
					new FileInputStream(
					"src/main/resources/config.properties");

			prop.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String getBrowser() {

		return prop.getProperty("browser");
	}

	public String getUrl() {

		return prop.getProperty("url");
	}
}