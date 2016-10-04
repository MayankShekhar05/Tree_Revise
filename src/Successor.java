
public class Successor {
	public int val;
	public Successor right;
	public Successor left;
	public Successor parent;
	public Successor(int val, Successor left, Successor right, Successor parent){
		this.val=val;
		this.right=right;
		this.left=left;
		this.parent=parent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Successor t13=new Successor(13,null, null,null);
		Successor t6=new Successor(6,null, null,null);
		Successor t4=new Successor(4,null, null,null);
		Successor t8=new Successor(8,null, null,null);
		Successor t2=new Successor(2,null, null,null);
		Successor t5=new Successor(5,null, null,null);
		Successor t7=new Successor(7,null, null,null);
		Successor t10=new Successor(10,null, null,null);
		Successor t1=new Successor(1,null, null,null);
		Successor t3=new Successor(3,null, null,null);
		Successor t9=new Successor(9,null, null,null);
		Successor t11=new Successor(11,null, null,null);
		
		t13.left=t6;
		t6.left=t4;
		t6.right=t8;
		t4.left=t2;
		t4.right=t5;
		t2.left=t1;
		t2.right=t3;
		t8.left=t7;
		t8.right=t10;
		t10.left=t9;
		t10.right=t11;
		
		t6.parent=t13;
		t4.parent=t6;
		t8.parent=t6;
		t5.parent=t4;
		t2.parent=t4;
		t1.parent=t2;
		t3.parent=t2;
		
		t8.parent=t6;
		t7.parent=t8;
		t10.parent=t8;
		t9.parent=t10;
		t11.parent=t10;
		
		Successor suc=inOrder(t3);
		System.out.println(suc.val);
		// TODO Auto-generated method stub

	}
	private static Successor inOrder(Successor root) {
		// TODO Auto-generated method stub
		if(root.right==null){
			Successor par=root;
			Successor gpar=par.parent;
			while(gpar.left!=par){
				par=gpar;
				gpar=gpar.parent;
			}
			return gpar;
		}
		else{
			Successor rChild=root.right;
			while(rChild.left!=null){
				rChild=rChild.left;
			}
			return rChild;
		}
		//return null;
	}

}
