import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DelData {
    private ConClo DbUtil;

    //删除信息
    public void del(String table,String value){
        String sql = "delete from ? where adcode = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtil.getConnection();
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, table);
            pstmt.setString(2, value);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DbUtil.close(pstmt);
            DbUtil.close(conn);		//必须关闭
        }
    }

}
