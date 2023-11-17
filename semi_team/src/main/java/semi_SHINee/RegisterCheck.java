package semi_SHINee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterCheck
 */
@WebServlet("/RegisterCheck")
public class RegisterCheck extends HttpServlet {
	private static final String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String username = "shinee";
	private static final String password = "shinee";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		 
		response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(jdbcurl, username, password);

            String id = request.getParameter("id");

            String sql = "SELECT USER_ID FROM USER_INFO WHERE USER_ID = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, id);

            ResultSet result = ps.executeQuery();

            if (result.next()) {
                // 중복된 아이디
                out.println("{\"duplicate\": true}");
            } else {
                // 사용 가능한 아이디
                out.println("{\"duplicate\": false}");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }

}

