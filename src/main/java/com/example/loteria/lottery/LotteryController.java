package com.example.loteria.lottery;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/shuffleNumbers")
public class LotteryController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        Integer one = Integer.valueOf(request.getParameter("one"));
        Integer two = Integer.valueOf(request.getParameter("two"));
        Integer three = Integer.valueOf(request.getParameter("three"));
        Integer four = Integer.valueOf(request.getParameter("four"));
        Integer five = Integer.valueOf(request.getParameter("five"));
        Integer six = Integer.valueOf(request.getParameter("six"));
        ArrayList source = new ArrayList();
        source.add(one);
        source.add(two);
        source.add(three);
        source.add(four);
        source.add(five);
        source.add(six);

        ArrayList randomNumbers = LotteryClass.getRandomNumbers();
        ArrayList commonElements = LotteryClass.getCommonElements(source, randomNumbers);

        LotteryResult lotteryResult = new LotteryResult(commonElements);
        request.setAttribute("result", lotteryResult);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
        request.setAttribute("source", source);
        request.setAttribute("randomNumbers", randomNumbers);
    }
}
