package com.bartoli;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client cliente=new Client();
        cliente.connetti();
        cliente.comunica();
    }
}
