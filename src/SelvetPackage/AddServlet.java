package SelvetPackage;

import conna.PagingPackage;
import doa.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by hp on 2017/4/11.
 */
public class AddServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setType(type);
        PagingPackage pagingPackage = new PagingPackage();
        int rs = pagingPackage.InsertUser(user);
        if (rs == 1){
            out.print("注册" + user.getUsername() + "成功");
            resp.setHeader("refresh", "3,URL=index.jsp");
        } else {
            out.print("注册失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req, resp);
    }
}
