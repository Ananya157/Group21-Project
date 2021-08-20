package com.springboot.onlineiplauction.AdminFunctionality;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.onlineiplauction.CommonRepository.CommonResponse;
import com.springboot.onlineiplauction.CommonRepository.DatabaseConnection;


@RestController
@ComponentScan(basePackages = {"onlineiplauction"})
public class  GetAdminList {

	@RequestMapping(value = "/getAdminList", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity<CommonResponse> getAdminList() {
		CommonResponse result;
		DatabaseConnection connection = new DatabaseConnection();
		if (connection.SQLDatabaseConnection() != null) {
			List<AdminResponse> listAdminResponse = new ArrayList<>();
			Statement statement;

			
			String query = "select * from playerdetails where isPlayer = 1";

			try {
				statement = connection.SQLDatabaseConnection().createStatement();
				ResultSet rs = statement.executeQuery(query);
				
				while (rs.next()) {
					ResultSetMetaData metaData = rs.getMetaData();
					AdminResponse adminResponse = new AdminResponse();
					for (int i = 0; i < metaData.getColumnCount(); i++) {
						if (metaData.getColumnLabel(i + 1).equals("Id")) {
							adminResponse.setId((Integer) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("FirstName")) {
							adminResponse.setFirstname((String) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("LastName")) {
							adminResponse.setLastname((String) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("Age")) {
							adminResponse.setAge((Integer) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("Country")) {
							adminResponse.setCountry((String) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("Record")) {
							adminResponse.setRecord((String) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("PreviousTeam")) {
							adminResponse.setPreviousTeam((String) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("LastBidValue")) {
							adminResponse.setLastBidValue((Integer) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("BattingAverage")) {
							adminResponse.setBattingAverage((Double) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("BowlingAverage")) {
							adminResponse.setBowlingAverage((Double) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("setCurrentTeam")) {
							adminResponse.setCurrentTeam((String) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("isNominated")) {
							adminResponse.setNominated((Boolean) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("Status")) {
							adminResponse.setStatus((Boolean) rs.getObject(i + 1));
						}
						if (metaData.getColumnLabel(i + 1).equals("isFreezed")) {
							adminResponse.setFreezed((Boolean) rs.getObject(i + 1));
						}	
					}
					listAdminResponse.add(adminResponse);
				}
				if(listAdminResponse.size() > 0){
					result = new CommonResponse(500, "Succes", listAdminResponse);
				}else {
					result = new CommonResponse(500, "No Players", null);
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
