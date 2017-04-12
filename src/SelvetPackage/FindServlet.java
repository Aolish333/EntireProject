package SelvetPackage;

import conna.PagingPackage;
import doa.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;


/**
 * Created by hp on 2017/4/5.
 */
public class FindServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        String id = req.getParameter("id");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type");
//        HttpSession session = req.setAttribute("user",username);
        //用session进行传值
        req.getSession().setAttribute("user", username);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setType(type);
        PagingPackage pagingPackage = new PagingPackage();
        ResultSet resultSet = pagingPackage.DoLogin(user);
        if (resultSet != null){
            out.print(user.getType());
            if(user.getType().equals("普通用户")){
                out.print("登陆"+user.getUsername()+"成功...");
                //LandSuccess.jsp
                resp.setHeader("refresh","3,URL=PagingServlt");
            }else{
                out.print("登陆"+user.getUsername()+"成功"+",三秒后进入跳转页面");
                //NewPage.jsp
                resp.setHeader("refresh","3,URL=ShowTwo.jsp");
            }
        }else {
            out.print("用户名或密码错误。");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req,resp);
    }
}
