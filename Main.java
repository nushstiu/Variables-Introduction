public class Main{
	public static void main(String[] args){
	//1. Declarați o variabilă de tip int și atribuiți-i o valoare.
		int Number = 1;
		System.out.println(Number);
	//2. Declarați o variabilă de tip double și atribuiți-i o valoare.  
		double secondNumber = 8.9;
		System.out.println(secondNumber);
	//3. Declarați o variabilă de tip boolean și atribuiți-i o valoare.
		boolean Value = true;
		System.out.println(Value);
	//4. Declarați o variabilă de tip string și atribuiți-i o valoare.
		String Name = "Lina"; 
		System.out.println(Name);	
	//5.Declarați două variabile int și efectuați o adunare între ele.
	int firstNumber1 = 5;
	int secondNumber2 = 9;
	int answer1 = firstNumber1+secondNumber2; 
	System.out.println(firstNumber1 + "+" + secondNumber2 + "=" + answer1);
	
	//6.Declarați două variabile int și efectuați o scadere între ele.
	int firstNumber2 = 5;
	int secondNumber3 = 9;
	int answer2 = firstNumber2-secondNumber3; 
	System.out.println(firstNumber2 + "-" + secondNumber3 + "=" + answer2);
		
	//7.Declarați două variabile int și efectuați o inmultire între ele.
	int firstNumber3 = 5;
	int secondNumber4 = 9;
	int answer3 = firstNumber3*secondNumber4; 
	System.out.println(firstNumber3 + "*" + secondNumber4 + "=" + answer3);
	
		
	//8.Declarați două variabile int și efectuați o impartire între ele.
	int firstNumber4 = 5;
	int secondNumber5 = 9;
	int answer4 = firstNumber4/secondNumber5; 
	System.out.println(firstNumber4 + "/" + secondNumber5 + "=" + answer4);
		
	//9. Declarați o variabilă int și o variabilă double și efectuați o conversie de la int la double.
	int firstNumber5 = 100;
	double secondNumber6; 
	secondNumber6 = (double) firstNumber5;
	System.out.println("Int: "+ firstNumber5);
	System.out.println("Double: "+ secondNumber6);
	
	//10.  Declarați o variabilă double și efectuați o conversie de la double la int.	
	double firstNumber6 = 99.9;
	int secondNumber7; 
	secondNumber7 = (int)firstNumber6; 
	System.out.println("Int: "+ secondNumber7);
	System.out.println("Double: "+ firstNumber6);
	
	//11.Declarați o variabilă de tip int și efectuați incrementarea cu 1.
	int i = 1;
	int b = i++;
	System.out.println(i++);
	
	//12. Declarați o variabilă de tip int și efectuați decrementarea cu 1.
	int a = 2;
	int c = a--;
	System.out.println(a--);
	
	//13. Declarați o variabilă de tip double și efectuați rotunjirea la întreg
	double variabila1 = 80.65;
	int a1 = (int) (variabila1 + 0.5);
	System.out.println(a1);

	//14.Declarați o variabilă de tip double și efectuați extragerea părții întregi in alta variabila.
	double variabila2 = 12.34;
	int a2 = (int) variabila2;
	System.out.println(a2);

	//15.Declarați o variabilă de tip int și verificați dacă este pară sau impară.
	int firstNumber7 = 12;
	int secondNumber8 = firstNumber7%2; 
	System.out.println(secondNumber8);
	
	}
}