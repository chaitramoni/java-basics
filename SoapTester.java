class SoapTester
{
public static void main (String a[])
{
Soap soap = new Soap();
soap.shape = "Oval";
soap.color = "cream";
soap.name = "Mysore Sandal Soap";
soap.toGetFresh();
System.out.println(soap.name);


Soap soap1 = new Soap();
soap1.shape = "Oval";
soap1.color = "green";
soap1.name = "Santoor Soap";
soap1.toGetFresh();

Soap soap2 = new Soap();
soap2.shape = "Oval";
soap2.color = "white";
soap2.name = "Detol Soap";
soap2.toGetFresh();

Soap soap3 = new Soap();
soap3.shape = "Oval";
soap3.color = "orange";
soap3.name = "Lux Soap";
soap3.toGetFresh();





}

}