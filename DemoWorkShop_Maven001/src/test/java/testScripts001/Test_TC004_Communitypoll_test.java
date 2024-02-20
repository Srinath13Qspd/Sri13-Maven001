package testScripts001;

import java.util.Scanner;

import org.testng.annotations.Test;

import baseClass.BaseClass002;
import pomClasses_WebElements.HomePage;

public class Test_TC004_Communitypoll_test extends BaseClass002 {
	

	 @Test
	 public void cummunityPollVoting() {
		 HomePage hm001=new HomePage(driver);
		 if(hm001.getCummunityPoleVoteResult().isDisplayed()) {
			System.out.println("Already you are done with voting "); 
			String s1= hm001.getCummunityPoleVoteResult().getText();
			System.out.println("and the polling result is ");
			System.out.println(s1);
		 }
		 else{
			 try (Scanner sc = new Scanner(System.in)) {
					System.out.println("Cast Your vote");
					 System.out.println("by selecting the any one of the below options");
					 System.out.println("Type 1 ...for Excellent");
					 System.out.println("Type 2 ...for Very good");
					 System.out.println("Type 3 ...for Poor");	
					 System.out.println("Type 4 ...for Very bad"); 
					 int vote=sc.nextInt();
					 
					 if(vote==1) {
						 hm001.getCummunityPoleRadioButtonExcellent().click();
					 }
					 else if(vote==2) {
						hm001.getCummunityPoleRadioButtonGood().click();
					}
					 else if(vote==3) {
						 hm001.getCummunityPoleRadioButtonPoor().click();
					 }
					 else if(vote==4) {
						 hm001.getCummunityPoleRadioButtonVeryBad().click();
					 }
					 

					 if(hm001.getCummunityPoleVoteResult().isDisplayed()) {
						 System.out.println("Sucessfully your vote has been casted");
						String s1= hm001.getCummunityPoleVoteResult().getText();
						System.out.println("and the polling result is " );
						System.out.println(s1);
					 }
					 else
					 {
						 System.out.println("Voting failed");
					 }
				}
		 }
		 
	 
	 }
}
