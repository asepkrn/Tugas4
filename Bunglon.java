public class Bunglon extends Reptil{
	String nama;
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Bunglon");
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
		
		
		Biawak Bunglon1 = new Biawak();
        Bunglon1.setjumlahkaki(4);
        Bunglon1.setnama("Bunglon");        
        System.out.println("jumlah kaki Biawak  = 4 "+Bunglon1.getnama());
        System.out.println("nama Reptil  = Bunglon "+Bunglon1.getnama());
	}
}