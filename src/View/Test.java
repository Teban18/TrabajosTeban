/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.ConnectionController;
import Controllers.CrudController;
import Controllers.DBImplementationcontroller;
import Controllers.LoginController;
import Controllers.PathController;
import Controllers.ReportController;
import java.sql.Connection;

/**
 *
 * @author Teban18
 */
public class Test {

    public static void main(String[] args) {
        //instanciacion Controladores
        ConnectionController connection = new ConnectionController();
        DBImplementationcontroller DBimplementation = new DBImplementationcontroller();
        LoginController logincontroller = new LoginController();
        CrudController crud = new CrudController();
        ReportController reportcontroller= new ReportController();
        PathController path= new PathController();


        //Control de conexion con la base de datos en todos los procesos de controladores
        connection.connect("");
        DBimplementation.setConnection(connection);
        DBimplementation.createDB();
        logincontroller.setConnection(connection);
        crud.setConnection(connection);
        path.connectJsonReportFile();
        reportcontroller.setConnection(connection);

        //Creacion objetos de vistas
        LoginView loginview = new LoginView();
        MenuView menuview = new MenuView();
        CityView cityview = new CityView();
        UserView userview = new UserView();
        ClientView clientview= new ClientView();
        ShipmentView shipmentview=new ShipmentView();
        RolView rolview=new RolView();
        ReportView reportview = new ReportView();


        //Relacion vistas-controladores
        loginview.setLogincontroller(logincontroller);
        cityview.setCrud(crud);
        userview.setCrud(crud);
        clientview.setCrud(crud);
        shipmentview.setCrud(crud);
        rolview.setCrud(crud);
        reportview.setReportController(reportcontroller);
        reportview.setPath(path);


        //Inicializando datos de las vistas
        cityview.setTableSets();
        userview.setTableSets();
        clientview.setTableSets();
        shipmentview.setTableSets();
        rolview.setTableSets();


        //Relacion entre las vistas
        loginview.setMenuView(menuview);
        menuview.setCityview(cityview);
        menuview.setUserview(userview);
        menuview.setClientview(clientview);
        menuview.setShipmentview(shipmentview);
        menuview.setRolview(rolview);
        menuview.setReportview(reportview);
        reportview.setClientview(clientview);
        reportview.setShipmentview(shipmentview);


        //Inicializacion del proceso
        loginview.setVisible(true);
        loginview.setLocationRelativeTo(null);

    }

}
