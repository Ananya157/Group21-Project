package com.springboot.onlineiplauction.TeamOwnerFunctionality;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.onlineiplauction.CommonRepository.CommonResponse;
import com.springboot.onlineiplauction.CommonRepository.DatabaseConnection;


@RestController
@ComponentScan(basePackages = {"onlineiplauction"})
public class  Upvote {

	@RequestMapping(value = "/upvote", method = RequestMethod.PUT)
	public @ResponseBody
	ResponseEntity<CommonResponse> upvote(@RequestParam String userName) {
		CommonResponse result;
		DatabaseConnection connection = new DatabaseConnection();
		if (connection.SQLDatabaseConnection() != null) {

			Statement statement;

			String query = "UPDATE playerDetails set LastBidValue = (select LastBidValue from playerDetails where userName = '" + userName + "') + 500  "
					+ "where userName = '" + userName + "'";

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
