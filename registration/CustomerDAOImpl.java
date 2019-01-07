package login.vivek.registration;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sun.rmi.transport.Connection;

public class CustomerDAOImpl implements CustomerDAO {
static Connection con;
static PreparedStatement ps;
	@Override
	public int insertcustomer(customer c) {
		// TODO Auto-generated method stub
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into customer values(?,?");
			ps.setString(1, c.getUsername());
		    ps.setString(2, c.getPassword());
		    ps.setString(3, c.getName());
		    status=ps.executeUpdate();
		    con.close();
		}catch(Exception e) {System.out.println(e);
	
		}
		return status;
	}

	@Override
	public customer getCustomer(String username, String pass) {
		customer c=new customer();
		// TODO Auto-generated method stub
	try {
		con=MyConnectionProvider.getCon();
		ps.setString(1, userid);
		ps.setString(2, pass);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			c.setName(rs.getString(1));
			c.setPassword(rs.getString(2));
			c.setName(rs.getString(3));
		}
			
		}catch(Exception e) {System.out.println(e);
	
		}return null;
	}

}
