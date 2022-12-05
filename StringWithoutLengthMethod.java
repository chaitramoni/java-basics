class StringWithoutLengthMethod
{
public static void main(String args[])throws Exception
{
String str = "samplestring";
int i = 0;
for(char c: str . toCharArray())
{
i++;
}
System.out.println("Length of given string ::" + i);
}

}