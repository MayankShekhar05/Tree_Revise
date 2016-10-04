
public class TreeComparision {
	public int val;
	public TreeComparision left;
	public TreeComparision right;
	public TreeComparision(int val,TreeComparision left, TreeComparision right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSubtree t13=new CheckSubtree(13,null, null);
		CheckSubtree t6=new CheckSubtree(6,null, null);
		CheckSubtree t4=new CheckSubtree(4,null, null);
		CheckSubtree t8=new CheckSubtree(8,null, null);
		CheckSubtree t2=new CheckSubtree(2,null, null);
		CheckSubtree t5=new CheckSubtree(5,null, null);
		CheckSubtree t7=new CheckSubtree(7,null, null);
		CheckSubtree t10=new CheckSubtree(10,null, null);
		CheckSubtree t1=new CheckSubtree(1,null, null);
		CheckSubtree t3=new CheckSubtree(3,null, null);
		CheckSubtree t9=new CheckSubtree(9,null, null);
		CheckSubtree t11=new CheckSubtree(11,null, null);
		
		CheckSubtree s13=new CheckSubtree(13,null, null);
		CheckSubtree s6=new CheckSubtree(6,null, null);
		CheckSubtree s4=new CheckSubtree(4,null, null);
		CheckSubtree s8=new CheckSubtree(8,null, null);
		CheckSubtree s2=new CheckSubtree(2,null, null);
		CheckSubtree s5=new CheckSubtree(5,null, null);
		CheckSubtree s7=new CheckSubtree(7,null, null);
		CheckSubtree s10=new CheckSubtree(10,null, null);
		CheckSubtree s1=new CheckSubtree(1,null, null);
		CheckSubtree s3=new CheckSubtree(3,null, null);
		CheckSubtree s9=new CheckSubtree(9,null, null);
		CheckSubtree s11=new CheckSubtree(11,null, null);
		
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
		
		s13.left=s6;
		s6.left=s4;
		s6.right=s8;
		s4.left=s2;
		s4.right=s5;
		s2.left=s1;
		s2.right=s3;
		s8.left=s7;
		s8.right=s10;
		s10.left=s9;
		s10.right=s11;
		
		boolean b=treeCompare(t13,s13);
		System.out.println(b);
	}
	private static boolean treeCompare(CheckSubtree t, CheckSubtree s) {
		// TODO Auto-generated method stub
		if(t!=null && s!=null){
			if(t.val==s.val){
				return treeCompare(t.left, s.left) && treeCompare(t.right, s.right);
			}
			else{
				return false;
			}
		}
		else if(t==null && s!=null){
			return false;
		}
		else if(t!=null && s==null){
			return false;
		}
		else{
			return true;
		}
	}

}
