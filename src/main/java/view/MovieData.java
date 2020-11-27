package view;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface MovieData {
public boolean updateStatus();
public  String getData() throws JsonProcessingException;
}
