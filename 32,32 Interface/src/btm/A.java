package btm;

interface A
{

}
class B
{
	
}
 class C implements A extends B {}

// order is not correct that is why compiler gives the cte
//order should be 1 extends then 2nd implements

