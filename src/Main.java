import java.util.Scanner;
class Node
{
    int value;
    Node next;
    public Node(int value)
    {
        this.value=value;
    }
}
class Stack
{
    static Node top;
    static int height;
    Stack(int value) {
        Node newnode = new Node(value);
        top = newnode;
        height = 1;
    }
    void print()
    {
        Node temp = top;
        while(temp!= null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
    public static void push(int value)
    {
        Node newnode=new Node(value);
        if(height==0)
        {
            top=newnode;
        }
        else {
            newnode.next=top;
            top=newnode;
        }
    }
    public static Node pop()
    {
        if(height==0)
        {
            return null;
        }
        Node temp=top;
        if(height==1)
        {
            return  null;
        }
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }




}
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        Stack sk=new Stack(num);
        System.out.println("Enter the value(enter -1 to finish): ");
        while (true)
        {
            num = scanner.nextInt();
            if(num==-1)
            {
                break;
            }
            sk.push(num);

        }
        sk.print();
        System.out.println("Elements are pushed in the stack");
        System.out.println(sk.pop());
        System.out.println("Elements are removed");

    }
}