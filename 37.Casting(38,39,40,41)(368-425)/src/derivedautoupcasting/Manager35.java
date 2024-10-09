//not availabe in material
package derivedautoupcasting;
class P 
{
	int i;

}

class Q extends P
{
	int j;
}

class R extends Q
{
	int k; 
}

class Manager35
{
	public static void main(String[] args) 
	{
	P p1=new Q();
	System.out.println(p1.i);
	//System.out.println(p1.j);
	Q q1=(Q)p1;
	System.out.println(q1.i);
	System.out.println(q1.j);
	P p2=new R();
	System.out.println(p2.i);
	//System.out.println(p2.j);
	//System.out.println(p2.k);
	Q q2=(Q)p2;
	System.out.println(q2.i);
	System.out.println(q2.j);
	//System.out.println(q2.k);
	R r2=(R)q2;
	System.out.println(r2.i);
	System.out.println(r2.j);
	System.out.println(r2.k);
	Object obj=new P();
	//System.out.println(obj.i);
	//System.out.println(obj.j);
	//System.out.println(obj.k);
	P p3=(P)obj;
	System.out.println(p3.i);
	//System.out.println(p3.j);
	//System.out.println(p3.k);
	Q q3=(Q)p3;
	System.out.println(q3.i);
	System.out.println(q3.j);
	//System.out.println(q3.k);
	R r3=(R)obj;
	System.out.println(r3.i);
	System.out.println(r3.j);
	System.out.println(r3.k);
			
	}
	
	
}
