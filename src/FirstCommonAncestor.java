
public class FirstCommonAncestor {
	public int val;
	public FirstCommonAncestor left;
	public FirstCommonAncestor right;
	public FirstCommonAncestor(int val, FirstCommonAncestor left, FirstCommonAncestor right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstCommonAncestor t1=new FirstCommonAncestor(1,null, null);
		FirstCommonAncestor t2=new FirstCommonAncestor(2,null,null);
		FirstCommonAncestor t3=new FirstCommonAncestor(3,null, null);
		FirstCommonAncestor t4=new FirstCommonAncestor(4,null,null);
		FirstCommonAncestor t5=new FirstCommonAncestor(5,null, null);
		FirstCommonAncestor t6=new FirstCommonAncestor(6,null,null);
		FirstCommonAncestor t7=new FirstCommonAncestor(7,null, null);
		FirstCommonAncestor t8=new FirstCommonAncestor(8,null,null);
		FirstCommonAncestor t9=new FirstCommonAncestor(9,null, null);
		FirstCommonAncestor t10=new FirstCommonAncestor(10,null,null);
		FirstCommonAncestor t11 = new FirstCommonAncestor(11,null,null);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t4.right=t9;
		t5.left=t10;
		t6.left=t11;
		
		FirstCommonAncestor b=getAncestor(t7,t11,t1);
		System.out.println(b.val);
		
	}
	private static FirstCommonAncestor getAncestor(FirstCommonAncestor p, FirstCommonAncestor q, FirstCommonAncestor root) {
		if(!covers(p,root) || !covers(p,root) || root==null){
			return null;
		}
		return findAncestor(p,q,root);
	}
	private static FirstCommonAncestor findAncestor(FirstCommonAncestor p, FirstCommonAncestor q, FirstCommonAncestor root) {
		// TODO Auto-generated method stub
		boolean pisonleft=covers(p,root.left);
		boolean qisonleft=covers(q,root.left);
		if(pisonleft!=qisonleft){
			return root;
		}
		if(pisonleft){
			return findAncestor(p,q,root.left);
		}
		else{
			return findAncestor(p,q,root.right);
		}
	}
	private static boolean covers(FirstCommonAncestor p, FirstCommonAncestor root) {
		// TODO Auto-generated method stub
		if(root==null){
			return false;
		}
		if(p==root){
			return true;
		}
		return covers(p, root.left) || covers(p, root.right);
	}

}
