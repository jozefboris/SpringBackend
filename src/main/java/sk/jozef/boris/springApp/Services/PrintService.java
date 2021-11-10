package sk.jozef.boris.springApp.Services;

public class PrintService {
    String data;


    public void print(){
        System.out.println(data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
