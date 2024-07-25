package net.media.training.live.dip;

public class MyDatabaseWriter implements DatabaseWriter{
    @Override
    public void writeData(String data) {
        MyDatabase myDatabase = new MyDatabase();
        myDatabase.write(data);
    }
}
