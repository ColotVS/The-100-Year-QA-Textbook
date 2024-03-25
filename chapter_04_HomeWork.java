public class chapter_04_HomeWork {
    //#04.3 Функции SQL и операторы SQL JOIN: Практика и ДЗ

    //Для самообучающихся студентов и студентов курсов

    //Используйте эмулятор.
    //https://www.w3schools.com/sql/trysql.asp?filename=trysql_asc

    //Напишите следующий запрос:
    //Для последнего заказа покажите customer's name, product name и employee's name.
    //Используйте JOIN нескольких таблиц.

    //SELECT Customers.CustomerName, Products.ProductName, Employees.LastName
    //FROM Orders
    //JOIN Customers ON Orders.CustomerID = Customers.CustomerID
    //JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
    //JOIN Products ON OrderDetails.ProductID = Products.ProductID
    //JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID
    //ORDER BY Orders.OrderID DESC
    //LIMIT 1;
}
