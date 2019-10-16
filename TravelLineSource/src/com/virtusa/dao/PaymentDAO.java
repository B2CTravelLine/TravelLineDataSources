package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.virtusa.model.PaymentModel;
import com.virtusa.utilities.ConnectionManager;

public class PaymentDAO {

		public boolean storePaymentDetails(PaymentModel paymentModel) throws ClassNotFoundException, SQLException
		{
			try {
				
			ConnectionManager connectionUtility=new ConnectionManager();
			Connection con=connectionUtility.openConnection();
			PreparedStatement statement1=con.prepareStatement("INSERT INTO payment VALUES ( ?, ?, ?)");
			statement1.setString(1,paymentModel.getCardHolderName());
			statement1.setLong(2,paymentModel.getCardNo());
			statement1.setInt(3,paymentModel.getCVV());
			statement1.executeUpdate();


			
			statement1.close();
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
			
		}
}
