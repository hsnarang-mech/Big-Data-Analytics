import java.util.StringTokenizer;
class trial
{
public static void main (String []args)
{
String s="hello friends, how are you?";
StringTokenizer st =new StringTokenizer(s);
while(st.hasMoreTokens())
{
String val=st.nextToken();
System.out.println(val.toUpperCase());
}
}
}
