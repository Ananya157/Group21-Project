package com.springboot.onlineiplauction.LoginFunctionality;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springboot.onlineiplauction.CommonRepository.*;
import com.springboot.onlineiplauction.LoginFunctionality.*;

@CrossOrigin(origins = "*")
@RestController
@ComponentScan(basePackages = {"onlineiplauction"})
public class  Login {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity<CommonResponse> login(@RequestParam String userName, String password) {
		CommonResponse result;
		DatabaseConnection connection = new DatabaseConnection();
		String responseMessage = "";
		if (connection.SQLDatabaseConnection() != null) {

			Statement statement;

			LoginResponse logginResponse = new LoginResponse();
			String query = "select * from loginDetails where username = '" + userName + "' and password = '" + password + "'";

			try {
				statement = connection.SQLDatabaseConnection().createStatement();
				ResultSet rs = statement.executeQuery(query);
				if(!rs.next()) {
					result = new CommonResponse(401, "Incorrect username or password", null);
				}else {
					String getQuery ="select id, FirstName, LastName, isAdmin,isPlayer,isTeamOwner from playerDetails where username = '" + userName  + "'";
					try {
						rs = statement.executeQuery(getQuery);
						while (rs.next()) {
							ResultSetMetaData metaData = rs.getMetaData();
							for (int i = 0; i < metaData.getColumnCount(); i++) {
								if (metaData.getColumnLabel(i + 1).equals("Id")) {
									logginResponse.setId((Integer) rs.getObject(i + 1));
								}
								if (metaData.getColumnLabel(i + 1).equals("FirstName")) {
									logginResponse.setFirstname((String) rs.getObject(i + 1));
								}
								if (metaData.getColumnLabel(i + 1).equals("LastName")) {
									logginResponse.setLastname((String) rs.getObject(i + 1));
								}
								if (metaData.getColumnLabel(i + 1).equals("isAdmin")) {
									logginResponse.setAdmin((boolean) rs.getObject(i + 1));
								}
								if (metaData.getColumnLabel(i + 1).equals("isPlayer")) {
									logginResponse.setPlayer((boolean) rs.getObject(i + 1));
								}
								if (metaData.getColumnLabel(i + 1).equals("isTeamOwner")) {
									logginResponse.setTeamOwner((boolean) rs.getObject(i + 1));
								}

							}
						}
						result = new CommonResponse(200, "Success", logginResponse);
						
					} catch (Exception e) {
						result = new CommonResponse(500, "SQLException" + e.getMessage(), null);
					}		
				}
			} catch (Exception e) {
				result = new CommonResponse(500, "SQLException" + e.getMessage(), null);
			}
		} else {
			result = new CommonResponse(500, "Failed", null);

		}
		return ResponseEntity.ok(result);
	}
}

