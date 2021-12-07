<%@page import="oracle.jdbc.OracleDriver"%>
<%@page  import="dbpackage.ConnectionProvider"%>
<%@page  import="java.sql.*" %>
<%@page import="java.lang.Class"%>
<%
Connection connection = null;
try {
DriverManager.registerDriver(new OracleDriver());
connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishal");
Statement statement = connection.createStatement();

//String q1 = "create table usersd(name varchar(100),email varchar(100)primary key,mobileNumber int,securityQuestion varchar(200),answer varchar(200),password varchar(100),address varchar(500),city varchar(100),state varchar(100),country varchar(100))";
//String q2 = "create table product(id int,name varchar(100),category varchar(100),price int,active varchar(100))";
//String q3 = "create table cart(email varchar(100),product_id int,quantity int,price int,total int,address varchar(500),city varchar(100),state varchar(100),country varchar(100),mobileNumber int,orderDate varchar(100),deliveryDate varchar(100),paymentMethod varchar(100),transactionId varchar(100),status varchar(100))";
String q4="create table message(id int primary key ,email varchar(100),subject varchar(200),body varchar(1000))";
//for autoincrement create sequence
//CREATE SEQUENCE MESSAGE_SEQ start with 1 increment by 1;
statement.execute(q4);
//statement.execute(q2);
//statement.execute(q3);
//statement.execute(q4);
out.println("Table usersd create sucessfully.");
connection.close();
}
catch(Exception e)
{
out.println("An error occurred."+e);
}
%>
