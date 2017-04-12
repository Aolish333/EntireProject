package SelvetPackage;

import conna.PagingPackage;
import doa.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by hp on 2017/4/11.
 * Servlet中的分页功能。
 */
public class PagingServlt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        int PerPage = User.PAGES_PER;
        int CurrentPage = 1;//当前页数
        int pages;//总共的页数

        if (req.getParameter("page") != null) {
            CurrentPage = Integer.parseInt(req.getParameter("page"));
        }
        PagingPackage pagingPackage = new PagingPackage();
        int CountsAll = pagingPackage.CountsAll();//全部的条目数。
//    List<User> list = new ArrayList<>();
//    list = pagingPackage.PartUser(CurrentPage);
        StringBuffer BarList = new StringBuffer();
        if (CountsAll % PerPage == 0) {
            pages = CountsAll / PerPage;
        } else {
            pages = CountsAll / PerPage + 1;
        }
        for (int i = 1; i <= pages; i++) {
            if (i == CurrentPage) {
                BarList.append(i);
            } else {
                //LandSuccess.jsp
                BarList.append("<a href=\"PagingServlt?page="+i+"\">"+i+"</a>");
            }
            BarList.append(" ");
        }

        //输出分页页面
        if (req.getParameter("page")!=null)
            CurrentPage= Integer.parseInt(req.getParameter("page"));
        List<User> userList = pagingPackage.PartUser(CurrentPage);
        out.println("<center><table border='1px'>\n" +
                "<tr>\n" +
                "<td>id</td>\n" +
                "<td>用户名</td>\n" +
                "<td>类型</td>\n" +
                "</tr>\n");
        for (User user : userList
                ) {
            out.println("<tr>\n" +
                    "<td>" + user.getId() + "</td>\n" +
                    "<td>" + user.getUsername() + "</td>\n" +
                    "<td>" + user.getType() + "</td>\n" +
                    "</tr>\n");
        }
        out.println("</table></center>");

        //输出bar
        out.print("<center>"+BarList+"</center>");

        //输出bar
        out.print("<center>"+"<a href=\"index.jsp\">返回主界面（新闻界面）</a>"+"</center>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req, resp);
    }
}
