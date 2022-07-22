package com.reyyencuneyt.Interface;
class DatabaseManager{
    public  void AddDatabase(IDatabase database){
        database.add();
    }
    public  void UpdateDatabase(IDatabase database){
        database.update();
    }
    public  void getDatabase(IDatabase database){
        database.get();
    }
    public  void DeleteDatabase(IDatabase database){
        database.delete();
    }
}
public class Main {
    public static void main(String[] args) {
        //IDatabase iDatabase= new IDatabase();
        // yukardaki satiri hata vermesi sebepi interfacten bir obje olustulmaz
    /*    IDatabase customer=new Customer();
        IDatabase student=new Student();
        student.log();
        customer.log();*/
        DatabaseManager databaseManager=new DatabaseManager();
        databaseManager.AddDatabase(new MysqlDatabase());
        databaseManager.DeleteDatabase(new Mongo());


    }
}
