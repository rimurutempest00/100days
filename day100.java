package seratushari;

import java.util.Scanner;

public class day100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaPertama,angkaKedua,angka,pilih;
            char operator,banding;
            double hasil = 0;
            boolean akhir = false;
            System.out.println("===================================");
            System.out.println("|\t---> 1. Aritmateka\t  |\n|\t---> 2. Perbandingan\t  |\n|\t---> 3. Penugasan\t  |\n|\t---> 4. dia\t\t  |\n|\t---> 5. Penilaian\t  |");
            System.out.println("===================================");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            if(pilih == 1 ){
                System.out.println("----> Operasi Aritmatika <----");
                System.out.print("Masukan angka : ");
                angkaPertama = input.nextInt();
                System.out.print("Pilih operator [+,-,x,/] : ");
                operator = input.next().charAt(0);
                System.out.print("Masukan angka : ");
                angkaKedua = input.nextInt();
                switch (operator) {
                    case '+':
                        hasil = angkaPertama + angkaKedua;
                        break;
                    case '-':
                        hasil =  angkaPertama - angkaKedua;
                        break;
                    case 'x':
                        hasil =  angkaPertama * angkaKedua;
                        break;
                    case '/':
                        if(angkaKedua != 0 ){
                            hasil = angkaPertama / angkaKedua;
                        }else{
                            System.out.println("Angka tidak boleh dibagi dengan 0 ");
                            return;
                        }
                        break;
                    default:
                    System.out.println("error");
                        break;
                }
                    System.out.println("hasil dari\n"+angkaPertama+" "+operator+" "+angkaKedua+" : "+hasil);
            }else if(pilih == 2){
                System.out.println("---->Operator perbandingan<----");
                System.out.println("ket : \n[==] menggunakan =\n[!=] menggunakan !");
                System.out.print("Masukan angka : ");
                angkaPertama = input.nextInt();
                System.out.print("Pilih operator [=,!,<,>] : ");
                banding = input.next().charAt(0);
                System.out.print("Masukan angka : ");
                angkaKedua = input.nextInt();
                switch (banding) {
                    case '=':
                        akhir = angkaPertama == angkaKedua;
                        break;
                    case '!':
                        akhir = angkaPertama != angkaKedua;
                        break;
                    case '<':
                        akhir = angkaPertama <= angkaKedua;
                        break;
                    case '>':
                        akhir = angkaPertama >= angkaKedua;
                        break;
                    default:
                    System.out.println("Tidak di temukan ");
                        break;
                }
                System.out.println("Hasil perbandingan :\n"+angkaPertama+" "+banding+" "+angkaKedua+" = "+akhir);
            }else if(pilih == 3){
                System.out.println("---->Operator penugasan<----");
                angkaPertama = 45;
                System.out.println("Sebelum melakukan penugasan\t: "+angkaPertama);
                angkaPertama += 5;
                System.out.println("hasil dari 45 += 5\t\t: "+angkaPertama);
                angkaPertama -= 10;
                System.out.println("hasil dari 50 -= 10\t\t: "+angkaPertama);
                angkaPertama /= 2;
                System.out.println("hasil dari 40 /= 2\t\t: "+angkaPertama);
                angkaPertama *= 4;
                System.out.println("hasil dari 20 *= 4\t\t: "+angkaPertama);
            }else if(pilih == 4){
                System.out.println("Gak bisa pilih dia :(");
                System.err.println("Silahkan cari yang lain karna dia telah bahagia bersama orang lain\nSEKIAN DAN TERIMAKSIH :)");
            }else if(pilih == 5){
                System.out.println("--->Peniaian<----");
                System.out.println("Hanya bilangan bulat");
                System.out.println("Masukan penilaian: ");
                    angka = input.nextInt();
                        if(angka > 0 && angka < 20 || angka >= 0 && angka <= 50){
                            System.out.println("Harus belajar lebih giat lagi !!");
                        }else{
                            System.out.println("Terimakasih");
                        }
            }else{
                System.out.println("Pilihan tidak tersediah ");
            }
        }
    }
