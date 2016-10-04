
public class MinimalTree {
	public int val;
	public MinimalTree left;
	public MinimalTree right;
	public MinimalTree(int val, MinimalTree left, MinimalTree right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public MinimalTree(int val){
		this.val=val;
		left=null;
		right=null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		MinimalTree root=populateTree(arr,0,arr.length-1);
		inOrderTraversal(root);
		
	}
	private static void inOrderTraversal(MinimalTree root) {
		// TODO Auto-generated method stub
		if(root!=null){
			inOrderTraversal(root.left);
			System.out.println(root.val);
			inOrderTraversal(root.right);
		}
	}
	private static MinimalTree populateTree(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if (start>end){
			return null;
		}
		int mid=(start+end)/2;
		MinimalTree n=new MinimalTree(arr[mid]);
		n.left=populateTree(arr,start,mid-1);
		n.right=populateTree(arr,mid+1,end);
		return n;
	}

}
