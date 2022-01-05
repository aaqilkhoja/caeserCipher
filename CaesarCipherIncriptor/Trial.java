      public class Trial{  public static void main(String[] args) {

                // create a connection to the database and catch any exception
        /*      Connection conn;
                try {
                        conn = DriverManager.getConnection("jdbc:postgresql:aaqilkhoja");
                } catch (Exception e) {
                        System.err.println("An error occured: "+e);
                        return;
                }*/
                getTranscript(1000000001);

        /*      try {
                        // prepare a statement ; might throw an exception
                        PreparedStatement st;
                        st = conn.prepareStatement("SELECT * FROM grades WHERE studentid =?");
                        st.setInt(1, Integer.parseInt(args[0]));

                        // execute it ; might throw an exception
                        ResultSet rs = st.executeQuery();

                        // print results
                        while (rs.next()) {
                                System.out.println(String.format("studentid=%d courseid=%d term=%s grade=%s",
                                        rs.getInt("studentid"), rs.getInt("courseid"), rs.getString("term"), rs.getString("grade")
                                ));
                        }
                        rs.close();
                        st.close();
                } catch (Exception e) {
                        System.err.println("An error occured: "+e);
                        return;
                } */

        }

        public void getTranscript(int studID) {

                String SQL = "Select * from grades JOIN students"+
                        "on grades.studentid = students.studentid"+
                        "JOIN courses.courseid=grades.courseid"+
                        "WHERE studentid =?";
        Connection conn;
        try {
                conn = DriverManager.getConnection("jdbc:postgresql:aaqilkhoja");
                } catch (Exception e) {
                        System.err.println("An error occured: "+e);
                        return;
                }

                try {
                        //stft is st for transcript
                        PreparedStatement stft;
                        stft = conn.prepareStatement(SQL);
                        stft.setInt(1,Integer.partInt(args[0]));
                        ResultSet rs = stft.executeQuery();

                        //print results
                        while(rs.next()){
                                System.out.println(String.format("studentid=%d lastname%s firstname%s courseid=%d coursename=%s term=%s grade=%s",
                        rs.getInt("studentid"), rs.getString("lastname"), rs.getString("firstname"), rs.getInt("courseid"), rs.getString("coursename"), rs.getString("term"), rs.getString("grade")
                        ));

        }
        }  catch (Exception e) {
                System.err.println("An error occured: "+e);
                return;
        }
}
