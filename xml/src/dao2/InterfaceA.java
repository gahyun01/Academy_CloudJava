package dao2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface InterfaceA {
	public String functionA(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

}
