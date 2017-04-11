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
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        //相同代码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type");
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setType(type);
        PagingPackage pagingPackage = new PagingPackage();

        int flag;

        flag = pagingPackage.DeleteUser(user);
        if (flag==1) {
            out.print("删除成功！");
            resp.setHeader("refresh","2,URL=ShowPage.jsp");
        }else {
            System.out.println("失败");
            resp.setHeader("refresh","3,URL=ShowPage.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req, resp);
    }
}
