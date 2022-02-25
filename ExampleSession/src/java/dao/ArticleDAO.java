/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Article;

/**
 *
 * @author Admin
 */
public class ArticleDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public List<Article> getAll() {
        try {
            String query = "  select * from Article";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            List<Article> list = new ArrayList<>();
            while (rs.next()) {
                Article A = new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
                list.add(A);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Article> getFavoriteOfAccountId(int accountId) {
        try {
            String query = "select Article.*,user from Article inner join Favorite on Article.ArticleID = Favorite.ArticleID\n"
                    + "where UserID=?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, accountId);
            rs = ps.executeQuery();
            List<Article> list = new ArrayList<>();
            while (rs.next()) {
                Article A = new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
                list.add(A);
            }
            return list;
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int create(Article A) {
        try {
            String query = "INSERT INTO [Genk].[dbo].[Article]\n"
                    + "           ([title]\n"
                    + "           ,[description]\n"
                    + "           ,[imageLink]\n"
                    + "           ,[creatorID])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, A.getTitle());
            ps.setString(2, A.getDescription());
            ps.setString(3, A.getImageLink());
            ps.setInt(4, A.getCreatorId());

            return ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int insertFavorite(int userId , int articleId) {
        try {
            String query = "Insert into Favorite(UserID,ArticleID) Values(?,?)";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, articleId);

            return ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
