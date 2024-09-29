class Continue
{
public static void main(String args[])
{
int a=5;
int i;
for(i=0;i<a;i++)
{
if(i%2==0)
{
continue;
}
else{
System.out.print(+i+ " is odd number");
}
}
}
}