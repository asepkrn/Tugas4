public class Biawak extends Reptil{
	String nama;
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Biawak");
	}
	
	public void Reptil(){
		super.tampilkan();
		System.out.println("===========================");
		super.berjalan();
		super.berlari();
		super.makan();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		Biawak pangil = new Biawak();
		pangil.Reptil();
		
		
		Biawak Biawak1 = new Biawak();
        Biawak1.setjumlahkaki(4);
        Biawak1.setnama("Biawak");        
        System.out.println("jumlah kaki = 4"+Biawak1.getnama());
        System.out.println("nama Reptil  = Biawak "+Biawak1.getnama());
	}
}