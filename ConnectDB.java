public class ConnectDB {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = 'https://client-demos.accenture.com/apiv4/'
   
   public static void main(String[] args) {
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver"); 

            //STEP 3: Open a connection
            //Database credentials
            String USER = 'admin_user'
            String PASSWORD = 'changeme'
            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            ...
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}