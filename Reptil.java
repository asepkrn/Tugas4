public class Reptil {
    int jumlahkaki;
    String nama;

    // konstruktor

    public Reptil(){
        this.jumlahkaki=4;
        this.nama="merayap";
    }

    public Reptil(int j, String n){
        this.jumlahkaki = j;
        this.nama = n;
    }    
    public void setjumlahkaki(int j){
        this.jumlahkaki=j;
    }
    public void setnama(String n){
        this.nama = n;        
    }
    public int getjumlahkaki(){
        return this.jumlahkaki;
    }
    public String getnama(){
        return this.nama;
    }    
    public void berjalan(){
        System.out.println("Reptil Berjalan");        
    }
    public void berlari(){
        System.out.println("Reptil berlari");        
    }
    public void makan(){
        System.out.println("Reptil makan");        
    }
    public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Sepeda");
	}
}