package classes.dossier.perso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import classes.dossier.perso.MotATrouver;

public class WordsGames {
	//on change le mot de 30%
	  public static String alteration(String mot) { 
		  
	  if (mot.length()>50){//controle 50 characteres 
		  return "mot ou message trop long"; 
	  }
	  int change=(int) (mot.length()*0.3);//30% du mot ou phrasse 
	  Random r= new Random(); 
	  int a=r.nextInt(mot.length()); 
	  int n=0; 
	  String m2="";
    
	  
	  while(m2.length()<(mot.length()-change)) { //il faut que le mot sois moins long de 30% 
  	  m2+=mot.charAt(n);//on construit le mot
  	  if (n==a) {//randomisation de la supression 
  		  m2=m2.substring(0, m2.length()-1);
  		  m2+="_";}
  	  n+=1; 
	  }
    while(m2.length()!=mot.length()) {
  	  m2+="_";
    }
	  return m2;
	  
	  
	  }
	  
	  
	  //ressemblance
	  @SuppressWarnings("finally")
	public static String ressemblance(String mot,String aTrouver) {
		  String r = mot.replaceAll("\\s","");
		  String r1=r.replaceAll("[0-9]","");
		/* String r2=r1.replaceAll("[@&\"/'()$?!-,.;...=]" , ""); */
		  String r2=r1.replaceAll("[^a-zA-Z]", "");
		  String r3= r2.toLowerCase();
		  boolean fin = true;
		  int i=0;
		  String n="";
		  
		  
		  while (i<r3.length() & fin) {
			  for (int a =i; a<r3.length();a++) {
				  
				  n+= r3.charAt(a);
				  }
			  if(n.equals(aTrouver)) {
				  fin=false;
				  
			  }
			  
			  
			  i++;
		}
		  
		  
		  for (int y=0;y<n.length()-3;y++) {
			  String m=n.substring(y, y+3);
			  for (int z=0; z<aTrouver.length()-3;z++) {
				  String m1 = aTrouver.substring(z,z+3);
				  if(m.equals(m1)) {
					  fin=false;
					  
				  }
			      if(fin==false) {
					  break;}
		  }
		  
		  
		  }
		  
		  
		  

		
	  
		  
		  if (fin==false) {
			  return "les mots sont trop ressemblant";}
		  return mot;
		  }
		  

	  
	  //choix du mot
	  public static String MotADeviner(String [] tab) {
		  
		  
		  Random m= new Random();
		  int nb= m.nextInt(tab.length-1);
		  return tab[nb];
		  }
	  
	  public static String Difficulte(Scanner s) {
		  System.out.println("Quelle difficulté ? F: facile, M= moyen, D= difficile");
		  
		  String devine="";
		  boolean b = true ;
		  while(b) {
			  String dificulte = s.next().toUpperCase();
			  
			  if(dificulte.equals("F")){
				  devine = MotADeviner(MotATrouver.facile);
				  break;
			  }
			  if(dificulte.equals("M")){
				  devine = MotADeviner(MotATrouver.moyen);
				  break;
			  }
			  if(dificulte.equals("D")){
				  devine = MotADeviner(MotATrouver.difficile);
				  break;
			  }
			  else {
				  System.out.println("veuillez bien saisir la difficulté...");
				 
			  }
				  
		  }
		  return devine;
	  }
	  

	  
	  
				 
	

	public static void main (String[] args){

		
		

	       
		String mot="arthur";

		String r2 ="leo";
		
		System.out.println(ressemblance(r2,mot));
		/*
		 * System.out.println(ressemblance(r3,mot));
		 * System.out.println(ressemblance(r4,mot));
		 * System.out.println(ressemblance(r5,mot));
		 */
	}
		
}

	  
			  
		  
		  
		  
	  





		  
		  
	  
	  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

	  
	  
	  

	 




	
	
	
	
	
    	
    





