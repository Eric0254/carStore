package br.com.carstore.servlet;

import dao.CarDao;
import model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

  @WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String carId = request.getParameter("id");
        String carName = request.getParameter("car-name");

        Car car = new Car(carName);

        new CarDao().createCar(car);

        if (carId.isBlank()) {

            CarDao.createCar(car);

        } else {

            CarDao.updateCar(car);
        }

        response.sendRedirect("/find-all-cars");



    }

}
