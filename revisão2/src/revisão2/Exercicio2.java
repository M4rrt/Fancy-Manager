/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisão2;
import java.util.Scanner;

/**
 *
 * @author ZoT
 */
public class Exercicio2 {
    int v[];

    public Exercicio2() {
        this.v = new int[10];
    }
    
        public void Exercicio_2(){
            Scanner sc = new Scanner(System.in);
            for(int i=0; i<10; i++){
                System.out.println("Adicione um valo para o index ["+i+"] : \n");
                v[i] = sc.nextInt();
            }
            int count = 0;
            int count2 = 0;
            for(int i=0; i<9; i++){
                if (v[i]>v[i+1]){
                     count += 1;
                }else {
                    count2 +=1;
                }
            }
            if(count == 9){
                System.out.println("decrescente");
            }else if(count2 == 9){
                System.out.println("crescente");
            }else System.out.println("não ordenado");
            System.out.println("digite o numero x: ");
            int x = sc.nextInt();
        }
}
