public class Mahasiswa {
	String nama;
	int npm;

	public Mahasiswa (String nama, int npm){
		this.nama = nama;
		this.npm = npm;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public void setNPM(int npm){
		this.npm = npm;
	}
	public String getNama(){
		return nama;
	} 
	public int getNPM(){
		return npm;
	}

}