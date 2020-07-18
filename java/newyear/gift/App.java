package newyear.gift;
//import java.util.*;
import java.util.Scanner;
abstract class Newyear_Gift
{
  void menu ()
  {
    System.out.println ("Chocolates Menu:");
    System.out.println
      ("1.white Chocolates \n2.milk Chocolates \n3.dark Chocolates\n");
  }
  void menu2 ()
  {
    System.out.println ("Sweets Menu:");
    System.out.println ("1.Barfi \n2.Laddu \n3.halwa");
  }
}

class Chocolates extends Newyear_Gift
{
  float sort (int NoOfPieces)
  {
    Scanner scan = new Scanner (System.in);
      System.out.println ("enter the type of Chocolate ");
    int TypeOfChoco = scan.nextInt ();
    if (TypeOfChoco >= 4)
      {
	return 0;
      }
    else
      {
	int price[] = { 20, 30, 45, 0 };
	int cost = price[TypeOfChoco - 1] * NoOfPieces;
	return cost;
      }
  }
}

class sweets extends Newyear_Gift
{
  float sort (int NoOfSweet)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter the type of sweet :");
    int TypeOfSweet = sc.nextInt ();
    if (TypeOfSweet >= 4)
      {
	return 0;
      }
    else
      {
	int price[] = { 40, 50, 27, 0 };
	int cost = price[TypeOfSweet - 1] * NoOfSweet;
	return cost;
      }
  }
}

public class App
{
  public static void main (String[]args)
  {
    System.out.println ("WELCOME TO THE NEW YEAR GIFT STORE ");
    Scanner sc = new Scanner (System.in);
    Chocolates c = new Chocolates ();
    sweets s = new sweets ();
    int WeightOfChocolates;
    float ChocolatesPrice;
    float SweetPrice;
    int WeightOfSweet;

      System.out.println ("enter number of chocolate pieces:");
    int NoOfPieces = sc.nextInt ();
    if (NoOfPieces != 0)
      {
	c.menu ();
	ChocolatesPrice = c.sort (NoOfPieces);
	 WeightOfChocolates = 54 * NoOfPieces;
      }
    else
      {
	ChocolatesPrice = 0;
	WeightOfChocolates = 0;
      }
    System.out.println ("enter number of sweets :");
    int NoOfSweet = sc.nextInt ();
    if (NoOfSweet != 0)
      {
	s.menu2 ();
	SweetPrice = s.sort (NoOfSweet);
	WeightOfSweet = 46 * NoOfSweet;
      }
    else
      {
	SweetPrice = 0;
	WeightOfSweet = 0;
      }
    System.out.
      println
      ("enter the constrain in which you want to arrage them \n1.based on price:\n2.based on weight:");
    int Order = sc.nextInt ();
    if (Order == 1)
      {
	System.out.println ("toatl price of gift:" +
			    (ChocolatesPrice + SweetPrice));
	if (ChocolatesPrice > SweetPrice)
	  System.out.println ("sorted order is Chocolates" + ChocolatesPrice +" sweets " + SweetPrice);
	else
	  System.out.println ("sorted order by price is sweets" + SweetPrice + "  Chocolates " + ChocolatesPrice);
      }
    if (Order == 2)
      {
	System.out.println ("toatl weight of gift:" +(WeightOfChocolates + WeightOfSweet));
	if (WeightOfChocolates > WeightOfSweet)
	  System.out.println ("sorted order is Chocolates" +WeightOfChocolates + " sweets " +WeightOfSweet);
	else
	  System.out.println ("sorted order by price is sweets" +WeightOfSweet + "  Chocolates " +WeightOfChocolates);
      }

  }
}
