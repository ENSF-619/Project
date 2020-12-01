package controller;

/**
 * ENSF 619 Group Project
 * This controller holds connection and table info necessary for
 * database interaction.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

public interface JDBCConnectionInfo {
	static final String CONNECTIONINFO = "jdbc:mysql://sql9.freemysqlhosting.net:3306/sql9378764?useSSL=false";
	static final String LOGIN = "sql9378764";
	static final String PASSWORD = "rrXgstV3nB";

	static final String MOVIETABLE = "MOVIE";
	static final String REGISTEREDUSERTABLE = "REGISTEREDUSER";
	static final String SHOWTIMETABLE = "SHOWTIME";
	static final String TICKETTABLE = "TICKET";
	static final String VOUCHERTABLE = "VOUCHER";
	static final String THEATRETABLE = "THEATRE";
}
