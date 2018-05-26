package worldseries;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WorldSeries
{

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File("//Users//saikv//Desktop//saikumar//Practice projects//practice//src//worldseries//WorldSeries.txt"));

        Scanner sc = new Scanner(System.in);

        String[] team =new String[50];
        String[] year=new String[50];
        int[] count=new int[50];
        int n;

        n=readFile(in,team,year,count,0); //read from file
        int t=processFile(sc,team,n); //process the file
        if(t>-1)
            displayTeam(team[t],year[t],count[t]); //display the team
        else
            System.out.println("No such record");

//print the results
//        System.out.println("\nStatitcs:"+
//                "\nTotal number of teams: "+n+
//                "\nName: Tim");
    }

    //read data from file
    private static int readFile(Scanner in, String[] team, String[] year, int[] count, int n)
    {
        int yr=1903,flag=0;
        String tmp;

//read from file
        while(in.hasNext())
        {
            flag=0;
            tmp=in.nextLine();
//System.out.println(tmp);
            if(yr==1904 ||yr==1994)
                yr++;

            for(int i=0;i<n;i++){
                if(team[i].equalsIgnoreCase(tmp))
                {

                    count[i]++;
                    year[i]+=String.valueOf(yr);
                    year[i]+=' ';
                    flag=1;
                }
            }
            if(flag==0)
            {
                team[n]=tmp;
                count[n]=1;
                year[n]=String.valueOf(yr);
                year[n]+=' ';
                n++;
            }

            yr++;
        }
        return n;
    }

    //get the teamname check and return values
    private static int processFile(Scanner in, String[] team,int n)
    {
        String tmp;

        System.out.print("Enter team name: ");
        tmp=in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(tmp.equalsIgnoreCase(team[i]))
                return i;
        }
        return -1;
    }

    //display the results
    private static void displayTeam(String team, String year, int count)
    {
        System.out.println("\nResults \nTeam : "+team+
                "\nTotal Won series: "+count+
                "\nYears :"+year);
    }

}