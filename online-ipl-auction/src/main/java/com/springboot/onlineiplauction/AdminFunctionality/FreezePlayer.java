package com.springboot.onlineiplauction.AdminFunctionality;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springboot.onlineiplauction.CommonRepository.*;

@RestController
@ComponentScan(basePackages = {"onlineiplauction"})
public class  FreezePlayer {

	@RequestMapping(value = "/freezePlayer", method = RequestMethod.PUT)
	public @ResponseBody
	ResponseEntity<CommonResponse> freezePlayer(@RequestParam String userName) {
		CommonResponse result;
		DatabaseConnection connection = new DatabaseConnection();
		if (connection.SQLDatabaseConnection() != null) {

			Statement statement;
			String query = "update playerdetails set isNominated = 0, isFreezed = 1, Status = 1 where username = '" + userName + "';";

			try {
				statement = connection.SQLDatabaseConnection().createStatement();
			int rowCount = statement.executeUpdate(query);
				
			result = new CommonResponse(200, "Success", "updated Successfully " + rowCount + " player");			
					
			} catch (Exception e) {
				result = new CommonResponse(500, "SQLException" + e.getMessage(), null);
			}
		} else {
			result = new CommonResponse(500, "Failed", null);

		}
		return ResponseEntity.ok(result);
	}
}

