public class Mahasiswa {
	public static void main (String[] args) {
	System.out.println("ini adalah method utama");

	Mahasiswa Annisa = new Mahasiswa();  \\dibuat objek mahasiswa untuk memanggil Nama dan Umur yang ada di class Mahasiswa
	Annisa.printNama();
	System.out.println(Annisa.calculateUmur());
}

public void printNama() { 
	System.out.println("Annisa");
}

public int calculateUmur() {
	int tahun_lahir = 1996;
	int tahun_sekarang = 2017;

	int umur;
	umur = tahun_sekarang - tahun_lahir;

	return umur; \\aksi untuk mengirim hasil untuk dikembalikan kembali  

}
}