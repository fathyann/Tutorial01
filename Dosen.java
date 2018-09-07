public class Dosen {
	String nama;
	int nik;

	Mahasiswa (String nama, int nik){
		this.nama = nama;
		this.nik = nik;
	}

	public void setNama (String nama){
		this.nama = nama;
	}

	public void setNik (int nik){
		this.nik = nik;
	}

	public String getNama(){
		return nama;
	}

	public int getNik(){
		return nik;
	}
}