package codedll;

import java.util.*;

public class coded_ll {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;next=null;}
    }
    public static void insert(int x){
        Node nnode=new Node(x);
        if(head==null) {
            head=new Node(x);
        }
        else {
            Node nnde = head;
            while (nnde.next != null) nnde = nnde.next;
            nnde.next = nnode;
        }
    }
    public static void inbet(Node nnde,int x,int p){
        Node nnode;
        Node r=new Node(x);
        if(p==1){nnode=head;head=new Node(x);head.next=nnode;}
        else{
            for(int i=0;i<p-2;i++){
                nnde=nnde.next;
            }
            r.next=nnde.next;
            nnde.next=r;
        }
    }
    public static void del(Node nnde,int x){
        Node r=head;
        while(nnde.data!=x){
            r=nnde;
            nnde=nnde.next;
        }
        if(nnde==head){
            head=nnde.next;
        }
        else {
            r.next = nnde.next;
        }
    }
    public static void delbynum(Node nnde,int x){
        Node r=head;
        if(x==1){
            head=nnde.next;
        }
        else {
            for(int i=0;i<x-1;i++){
                r=nnde;
                nnde=nnde.next;
            }
            r.next=nnde.next;
        }
    }
    static void display(Node nnde)
    {
        while (nnde != null)
        {
            System.out.print(nnde.data + " ");
            nnde = nnde.next;
        }
    }
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int i=0;
        while(i!=5) {
            System.out.println();
            System.out.println("************Menu***********\n1.Make a LinkedList\n2.Delete by value\n3.Delete by position\n4.Insert between LinkedList\n5.Exit");
            System.out.println();
            i=s1.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Insert value: ");
                    int v = s1.nextInt();
                    insert(v);
                    display(head);
                    break;
                case 2:
                    System.out.println("Insert value to delete: ");
                    v = s1.nextInt();
                    del(head, v);
                    display(head);
                    break;
                case 3:
                    System.out.println("Insert position to delete: ");
                    v = s1.nextInt();
                    delbynum(head, v);
                    display(head);
                    break;
                case 4:
                    System.out.println("Insert 'value' in between 'position': ");
                    v = s1.nextInt();
                    int p = s1.nextInt();
                    inbet(head, v, p);
                    display(head);
                    break;
                case 5:
                    break;
            }
        }
        s1.close();
    }
}
