public class FirstPro1
{
public static void main(String[]args)
{
int n=1234;
int num=n;
while(n>0)
{
int remainder=n%10;
reverse=(reverse*10)+remainder;
n=n/10;
}
}
}
if (num==reverse)
{
System.out.println(num+"is a palindrom number");
}
else
{
System.out.println(num+"is not a palindrom number");
}
}
}
