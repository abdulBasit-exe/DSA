package DSA_PBl;

import java.io.FilterOutputStream;

public class Solution {
    public Solution(){
        new Main();
    }
    //this method will return two-dimensional String array containing name of country and its average earth quack of each year
    public String[][] question1(){
        //calling array of stack of each country
        LStack[] countries=new Main().getCountryStack();
        //for storing country name and its average
        String[][] quakes=new String[52][2];
        //index of each country in quacks array is handled by index variable
        int index=0;
        double maxAverage=0;//initial maximum average
        String country="";//for storing name of country having max average
        int countYears=0;//for counting total no of years in which earth quack came for each country
        int count=0;//for comparison
        int counter=1965;//for comparison
        int a=1;//to ensure that else runs only once
        for(int i=1965;i<=2016;i++){
            //taking copy of every stack one by one so that pop method can be called
            LStack stack=countries[count++].copy();
            //size of selected stack
            int x=stack.getSize();
            //getting data from selected stack
            for(int y=0;y<x;y++){
                //splitting date into columns so that year can be separated
                String[] date=stack.pop().getDate().split("/");
                //converting string year into int year
                int year=Integer.parseInt(date[2]);
                if(a==2){
                    if(year!=counter){
                        countYears++;
                        counter=year;
                    }
                }
                else {
                    counter=year;
                    countYears++;
                    a++;
                }
            }
            double average=(double)x/countYears;
            //choosing max average and assigning it to tha maxAverage variable
            if(average>maxAverage){
                maxAverage=average;
                country=stack.getStackName();
            }
            quakes[index][0]="Name:  "+stack.getStackName();
            quakes[index++][1]="Average: "+average;
            countYears=0;
            a=1;
        }
        System.out.println("Country having maximum average of earth quack in each year is "+country+" and maximum average is: "+maxAverage);
        return quakes;
    }
    public LQueue question2(){
        LQueue queue=new Main().getEarthQuackQueue().copy();
        LQueue queue1=new LQueue();
        for(int i=1965;i<2016;i++){
            if(i>=2005)queue1.add(queue.remove());
            else queue.remove();
        }
        return queue1;
    }
    //this method will get country name and will return 5 recent earth quack information
    public LStack question3(String countryName){
        //declaring stack for making copy of actual stack so that pop method can be called
        LStack stack=new LStack(countryName);
        //for matching country name with stack and then assign copy of matched stack to stack
        for(LStack s:new Main().getCountryStack()){
            if(countryName.equals(s.getStackName())){
                stack=s.copy();
                break;
            }
        }
        //for storing  5 recent earth quacks declaring stack1
        LStack stack1=new LStack(countryName);
        //storing earth quacks into array so that can be stored into stack1 as directly pop method will store in reverse order
        EarthQuake[] quakes=new EarthQuake[5];
        for(int i=0;i<5;i++)quakes[i]=stack.pop();
        for(int j=quakes.length-1;j>=0;j--)stack1.push(quakes[j]);
        return stack1;
    }
    public LList question4(){
        LList list=new Main().getRecentCountryWiseQuacksList().copy();
        LList list1=new LList();
        int size= list.getSize();
        for(int i=0;i<size;i++){
            EarthQuake quake=list.delete();
            if(quake.getMagnitude()>=6)list1.insert(quake);
        }
            list1.reverse();
        return list1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

//        -- Question 1 :
//        String[][] que1= s.question1();
//        for (int i=0; i <que1.length; i++){
//            System.out.println(que1[i][0]+ ", "+ que1[i][1]);
//        }



//        LList que4 = s.question4();
//        int j=que4.getSize();
//        for(int i=0;i<j;i++) System.out.println(que4.delete());

//       -- Question 2 :
//        LQueue que2 = s.question2();
//        int j=que2.size();
//        for (int i=0;i<j; i++) que2.print();

//        -- Question 3:
        LStack que3 = s.question3("Japan");
        que3.display();

    }
}
