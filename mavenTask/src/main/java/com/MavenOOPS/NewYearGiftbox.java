package com.MavenOOPS;
import java.util.Scanner;
public class NewYearGiftbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int total_weight = 0,quantity = 0,weight = 0,totalbox_wt = 0;
        char choice;
        SweetsandChocolates collect;
        Boolean select_items=true;
        
       
        System.out.println("Fill the gift box with given sweets and candies available below:");
        while(select_items) {
       
        System.out.println("SELECT AVAILABLE CANDIES AND SWEETS!");
        System.out.println("1.JOLLY RANCHERS CHOCOLATE");
        System.out.println("2.MILKYWAY CANDY BAR");
        System.out.println("3.GULAB JAMUN SWEET");
        System.out.println("4.JALEBI SWEET");
        System.out.println("5.RASGULLA SWEET");
        System.out.println("6.KALAKAND SWEET");
        System.out.println("SELECT AND DROP ITEMS OF YOUR CHOICE INTO YOUR GIFTBOX(1-6):");
        
        
        	
        switch(scanner.next().charAt(0))
        {
        case '1':
        	   System.out.println("Enter the quantity:");
        	   quantity=scanner.nextInt();
        	   System.out.println("Enter the weight in grams:");
        	   weight=scanner.nextInt();
        	   collect= new JollyRancher();
        	   total_weight=collect.calculateWeight( quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;
        	   System.out.println("Total weight of JollyRancher Chocolate is:"+total_weight+"grams");
        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
               
        	   System.out.println("Do you want any other item (y/n)");
        	   choice=scanner.next().charAt(0);
        	      if(choice=='y'|| choice=='Y')
        	        { 
        	    	  select_items=true;
        	          break;
        	        }
        	     else
        		    {
        	    	 select_items=false;
                     System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                     
                     break;
                    }
        case '2':
        	   System.out.println("Enter the quantity:");
        	   quantity=scanner.nextInt();
        	   System.out.println("Enter the weight in grams:");
        	   weight=scanner.nextInt();
        	   collect=new MilkyWayCandyBar();
        	   total_weight=collect.calculateWeight(quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;

        	   System.out.println("Total weight of MilkyWay candies is:"+total_weight+"grams");
        	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	   System.out.println("Do you want any other item (y/n)");
        	   choice=scanner.next().charAt(0);
        	      if(choice=='y'|| choice=='Y')
        	        { 
        	    	  select_items=true;
        	          break; 
        	        }
        	      else
        		    {
        	    	  select_items=false;
        	          System.out.println("Total gift box weight is:"+totalbox_wt+"grams");
        	          break;
        	        }
        case '3':
        	System.out.println("Enter the quantity:");
        	quantity=scanner.nextInt();
        	System.out.println("Enter the weight in grams:");
        	weight=scanner.nextInt();
        	collect = new GulabJamunSweet();
        	total_weight=collect.calculateWeight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Gulab Jamun Sweet is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("Do you want any other item (y/n)");
        	choice=scanner.next().charAt(0);
        	if(choice=='y'|| choice=='Y')
        	    {
        		select_items=true;
        	break;
        	}
        	else
        		{
        		select_items=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		
        	break;
        	}
        case '4':
        	System.out.println("Enter the quantity:");
        	quantity=scanner.nextInt();
        	System.out.println("Enter the weight in grams:");
        	weight=scanner.nextInt();
        	collect=new JalebiSweet();
        	total_weight=collect.calculateWeight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;
        	

        	System.out.println("Total weight of Jalebi Sweets is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("Do you want any other item (y/n)");
        	choice=scanner.next().charAt(0);
        	if(choice=='y'|| choice=='Y')
        	    {
        		select_items=true;
        	break;
        	}
        	else
        		{
        		select_items=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                
        		break;
        		}
        case '5':
        	System.out.println("Enter the quantity:");
        	quantity=scanner.nextInt();
        	System.out.println("Enter the weight in grams:");
        	weight=scanner.nextInt();
        	collect=new RasgullaSweet();
        	total_weight=collect.calculateWeight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Rasgulla sweet is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("Do you want any other item (y/n)");
        	choice=scanner.next().charAt(0);
        	if(choice=='y'|| choice=='Y')
        	    {
        		select_items=true;
        	break;
        	}
        	else
        		{
        		select_items=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		
        		break;
        		}
        case '6':
        	System.out.println("Enter the quantity:");
        	quantity=scanner.nextInt();
        	System.out.println("Enter the weight in grams:");
        	weight=scanner.nextInt();
        	collect=new KalakandSweet();
        	total_weight=collect.calculateWeight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Kalakand sweet is:"+total_weight+"grams");
        	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        	System.out.println("Do you want any other item (y/n)");
        	choice=scanner.next().charAt(0);
        	if(choice=='y'|| choice=='Y')
        	    {
        		select_items=true;
        	    
        		break;
        	}
        	else
        		{
        		select_items=false;
        		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
        		
        		break;
        		}
        default: System.out.println("PLEASE SELECT ITEMS FROM THE PRE-DETERMINED LIST ONLY!!");
        
 
        }
       
      
        }
           
        

	}
}
