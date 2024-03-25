public class chapter_04_HomeWork {
    //#04.3 Функции SQL и операторы SQL JOIN: Практика и ДЗ

    //Для самообучающихся студентов и студентов курсов

    //Используйте эмулятор.
    //https://www.w3schools.com/sql/trysql.asp?filename=trysql_asc

    //Напишите следующий запрос:
    //Для последнего заказа покажите customer's name, product name и employee's name.
    //Используйте JOIN нескольких таблиц.

    //SELECT MAX (Orders.OrderDate), Customers.CustomerName, Product.ProductName, Employees.FirstName, Employees.LastName FROM  Orders
    //JOIN Customers
    //ON Orders.CustomerID = Customers.CustomerID
    //JOIN Products
    //ON Orders.ProductsID = Products.ProductsID;
    //JOIN Employees
    //ON Orders.EmployeesID = Employees.EmployeesID
}
