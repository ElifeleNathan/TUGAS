public class TugasStarStambukDanInisial {
    public static void main(String[] args) {
        /*untuk i sebagai baris dan j sebagai kolom*/
        /*untuk i dimulai dari 1 sampai 5 baris*/
        for(int i=1;i<=5;i++) 
        {
            /*untuk j dimulai dari 1 sampai 5 kolom*/
            for(int j=1;j<=5;j++)
            {
                /*untuk bentuk 0 (nol)*/
                /*untuk membentuk bintang bagian baris pertama horizontal*/
                  if(i==1 || i==5 )
                  System.out.print("* ");
                  /*untuk membentuk bagian kiri veritkal */
                  else if(j==1 || j==5)
                  System.out.print("* ");
                  /*untuk mengatur bagian bintang di sisi kanan*/
                  else
                  System.out.print("  ");
  
            }
                /*untuk men=mberi jarak antara bentuk 1 dan 0 (0)*/
                System.out.print(" ");
                /*untuk membentuk angka 1 dan memberi jarak pada sisi kanan*/
                System.out.print("*  ");
                /*Untuk membentuk huruf N*/
                for(int j=1;j<=5;j++){
                    /*untuk membentuk 2 garis vertikal dan memberi jarak pada kolom bintang bagian kiri*/
                    if(j==1||j==5)
                    System.out.print("* ");
                    /*untuk menghubungkan nilai 1 pada variabel j dengan nilai 1 pada variabel i sehingga membentuk vertikal dari kolom kiri baris 1 ke kolom 5 baris 5*/
                    else if(j==i)
                    /*hanya untuk mengatur bagian kanan vertikal*/
                    System.out.print("* ");
                    /*mengatur bintang bagian tengah dan kanan*/
                    else
                    System.out.print("  ");
                }
                /*untuk membuat semua bintang tersusun ke bawah*/
                System.out.println("");
        }
    }
    
}
