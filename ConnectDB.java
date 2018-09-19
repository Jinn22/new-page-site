public class ConnectDB {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = 'https://online-database.client.com:12345/api' 
   
   public static void main(String[] args) {
    try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver"); 

            //STEP 3: Open a connection
            //Database credentials
            String USER = 'ken.yang'
            String PASSWORD = 'password12345'
            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}




        