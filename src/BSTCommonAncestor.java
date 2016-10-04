
public class BSTCommonAncestor {
	public int val;
	public BSTCommonAncestor left;
	public BSTCommonAncestor right;
	
	public BSTCommonAncestor(int val, BSTCommonAncestor left, BSTCommonAncestor right){
		this.val=val;
		this.left=left;
		this.right=right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTCommonAncestor t13=new BSTCommonAncestor(13,null, null);
		BSTCommonAncestor t6=new BSTCommonAncestor(6,null, null);
		BSTCommonAncestor t4=new BSTCommonAncestor(4,null, null);
		BSTCommonAncestor t8=new BSTCommonAncestor(8,null, null);
		BSTCommonAncestor t2=new BSTCommonAncestor(2,null, null);
		BSTCommonAncestor t5=new BSTCommonAncestor(5,null, null);
		BSTCommonAncestor t7=new BSTCommonAncestor(7,null, null);
		BSTCommonAncestor t10=new BSTCommonAncestor(10,null, null);
		BSTCommonAncestor t1=new BSTCommonAncestor(1,null, null);
		BSTCommonAncestor t3=new BSTCommonAncestor(3,null, null);
		BSTCommonAncestor t9=new BSTCommonAncestor(9,null, null);
		BSTCommonAncestor t11=new BSTCommonAncestor(11,null, null);
		
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
		
		BSTCommonAncestor ancestor= findAncestor(t13, t7, t11);
		if(ancestor!=null){
			System.out.println(ancestor.val);
		}
		else{
			System.out.println("No common ancestor");
		}
	}

	private static BSTCommonAncestor findAncestor(BSTCommonAncestor root, BSTCommonAncestor p, BSTCommonAncestor q) {
		// TODO Auto-generated method stub
		if((root.val>p.val && root.val<q.val)||(root.val==p.val)|| (root.val==q.val)){
			return root;
		}
		else if(root.val>q.val){
			return findAncestor(root.left, p, q);
		}
		else if(root.val<p.val){
			return findAncestor(root.right, p, q);
		}
		return null;
	}

}
