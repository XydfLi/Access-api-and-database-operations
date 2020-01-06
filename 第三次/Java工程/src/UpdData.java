import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdData {
    private ConClo DbUtil;

    //更新数据
    public void update(String table,String key0,String value0,String adcode,String key1,String value1){
        String sql = "update "+table+" set "+key0+" =? where adcode=? and "+key1+"=?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtil.getConnection();
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, value0);
            pstmt.setString(2, adcode);
            pstmt.setString(3, value1);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DbUtil.close(pstmt);
            DbUtil.close(conn);
        }
    }

}
