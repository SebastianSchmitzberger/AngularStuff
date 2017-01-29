package at.schmitzberger;

import java.util.UUID;

public class App 
{
    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }

    public String generateUniqueKey() {
        return UUID.randomUUID().toString();
    }
}
