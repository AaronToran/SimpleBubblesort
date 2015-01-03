import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;

    class Arraybub
    {
        private long[] a; //ref to array a
        private  int nElems; //number of data elements
        //------------------------------------------------
        public Arraybub(int max){
            a = new long[max];
            nElems = 0;
        }
        //------------------------------------------------
        public void insert(long value){
            a[nElems] = value;
            nElems++; 
        }
        //------------------------------------------------
        public void display() {
            for(int j=0; j<nElems; j++)
                System.out.print(a[j] + " ");
            System.out.println(" ");
        }
        //------------------------------------------------
        public void bubblesort(){
            int out,in;

            for(out=nElems - 1; out>1; out--)
                for(in=0; in<out; in++)
                    if(a[in] > a[in+1])
                        swap(in, in+1);
        }
        //------------------------------------------------
        private void  swap(int one, int two){
            long temp = a[one];
            a[one] = a[two];
            a[two]=temp;
        }
    }
    class BubbleSortApp{
     public static void main(String[] args){
         int maxSize =100; //array max size
         Arraybub arr; //ref to array
         arr = new Arraybub(maxSize);

         arr.insert(77); //filling the array
         arr.insert(99);
         arr.insert(44);
         arr.insert(55);
         arr.insert(22);
         arr.insert(88);
         arr.insert(11);
         arr.insert(00);
         arr.insert(66);
         arr.insert(33);
         
	     System.out.println("Unsorted ");
	     arr.display();
	     System.out.println(" ______________________________");
	     System.out.println(" ");
         System.out.println("Sorted ");

         arr.bubblesort();

         arr.display();

         
     }

    }


