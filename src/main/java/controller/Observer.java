package controller;

import java.io.IOException;

public interface Observer {
public String sendRequest(String request) throws IOException;
}
