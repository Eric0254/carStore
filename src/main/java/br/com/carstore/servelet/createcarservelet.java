package br.com.carstore.servelet;

import br.com.carstore.dao.CarDao;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class createcarservelet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");

        Car car = new Car(carName);

        CarDao carDao = new CarDao();

        carDao.createCar(car);

        System.out.println(carName);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
