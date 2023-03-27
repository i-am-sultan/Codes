public class pattern1 {
    
/*
A
ab
ABC
abcd
ABCDE

*/
/*

ZYXWU
ZYXW
ZYX
ZY
Z

*/
    public static void main(String[] args) 
    {
        for(int i=90;i>=85;i--){
            for(int j=90;j>i-5;j--){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
