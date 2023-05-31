package in.ineuron.in;

public class AddUptoTarget {
public static int[] addTwo(int[] n,int target) {
	
	for(int i=0;i<n.length;i++) {
		for(int j=i+1;j<n.length;j++) {
			if(n[i]+n[j]==target) {
				return new int[] {i,j};
			}
		}
	}
	return new int[] {};
}
	public static void main(String[] args) {
		int[] n= {2,7,6,2,15};
		int target =9;
//        AddUptoTarget at=new AddUptoTarget();
   int [] indices=addTwo(n,target);
  if(indices.length==2) {
	  System.out.println(indices[0]+"   "+indices[1]);
  }else {
	  System.out.println("No indices  found");
  }
	}

}
