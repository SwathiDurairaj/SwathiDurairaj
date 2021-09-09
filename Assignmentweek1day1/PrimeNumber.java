package Assignmentweek1day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 13;
boolean pm=false;
for(int i=2;i<=n/2;i++)
{
	if(n%i==0) {
		pm=true;
		break;
	}
	if(!pm)
		System.out.println(n+"is the PrimeNumber");
	else
		System.out.println(n+"is not a PrimeNumber");
	}
}

		
	}


