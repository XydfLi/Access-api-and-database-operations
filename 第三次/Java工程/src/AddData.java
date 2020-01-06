import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {
    private ConClo DbUtil;

    //增加数据
    public void add(String table,String key0,String value0,String key1,String value1,int live){
        String sql;
        if(live==1) {
            sql = "insert into " + table + "(" + key0 + ") values(?)";
        } else {
            sql = "insert into "+table+"("+key0+","+key1+") values(?,?)";
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = DbUtil.getConnection();
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            if(live==1){
                pstmt.setString(1, value0);
            }else {
                pstmt.setString(1, value0);
                pstmt.setString(2, value1);
            }
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            DbUtil.close(pstmt);
            DbUtil.close(conn);
        }
    }

}
