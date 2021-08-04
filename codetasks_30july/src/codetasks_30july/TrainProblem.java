package codetasks_30july;
class TrainEncap{
	private String traincode;
	private String stationname;
	private String arr,dep;
	public void Trainvalues(String traincode, String stationname, String arr,String dep)
	{
		this.traincode=traincode;
		this.stationname=stationname;
		this.arr=arr;
		this.dep=dep;
		
	}
	public void Display(int i)
	{
		++i;
		System.out.println(i+ " " + traincode + " " + stationname + " " + arr + " " + dep);
	}
}
public class TrainProblem {

	public static void main(String[] args)
	{
		TrainEncap[] tr=new TrainEncap[7];
		int i;
		tr[0]=new TrainEncap();
		tr[1]=new TrainEncap();
		tr[2]=new TrainEncap();
		tr[3]=new TrainEncap();
		tr[4]=new TrainEncap();
		tr[5]=new TrainEncap();
		tr[6]=new TrainEncap();
		
		tr[0].Trainvalues("YPR","Yasvantpur Jn","0.0","4.05");
		tr[1].Trainvalues("GTL","Guntakal Jn","3.45","3.50");
		tr[2].Trainvalues("SC","Secundrabad Jn","8.55","9.10");
		tr[3].Trainvalues("BPQ","Balharshah","13.30","13.35");
		tr[4].Trainvalues("HBJ","Habibganj","21.20","21.25");
		tr[5].Trainvalues("JHS","Jhansi Jn","1.15","1.20");
		tr[6].Trainvalues("DEE","Delhi S Rohilla","7.00","0.0");
		
		for(i=0;i<7;i++)
		{
			tr[i].Display(i);
		}
	}

}
