
public class CheckSubtree {
	public int val;
	public CheckSubtree left;
	public CheckSubtree right;
	
	public CheckSubtree(int val, CheckSubtree left, CheckSubtree right){
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
		
		CheckSubtree s8=new CheckSubtree(8,null, null);
		CheckSubtree s7=new CheckSubtree(7,null, null);
		CheckSubtree s10=new CheckSubtree(10,null, null);
		CheckSubtree s9=new CheckSubtree(9,null, null);
		CheckSubtree s11=new CheckSubtree(11,null, null);
		
		s8.left=s7;
		s8.right=s10;
		s10.left=s9;
		s10.right=s11;
		
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
		boolean b=checkSub(t13,s8);
		System.out.println(b);
	}
	private static boolean checkSub(CheckSubtree t13, CheckSubtree s8) {
		// TODO Auto-generated method stub
		if(t13==null){
			return false;
		}
		if(t13.val==s8.val){
			return checkElements(t13,s8);
		}
		else{
			return checkSub(t13.left,s8) || checkSub(t13.right,s8);
		}
	}
	private static boolean checkElements(CheckSubtree t13, CheckSubtree s8) {
		// TODO Auto-generated method stub
		if(t13!=null && s8!=null){
			if(t13.val==s8.val){
				return checkElements(t13.left,s8.left) && checkElements(t13.right,s8.right);
			}
			else{
				return false;
			}
		}
		else{
			return true;
		}
	}

}
