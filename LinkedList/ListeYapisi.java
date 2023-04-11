package LinkedList;

public class ListeYapisi {
    Node head = null ;
    Node tail = null;

    void ekle(int x ){
        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;

        if(head==null){
            head = eleman;
            System.out.println("liste oluşturuldu obje eklendi");
        }else{
            tail.next = eleman; // son elemanın devamına yeni düğümü ekledim
            tail = eleman;         // tail (son füğümü) güncelledim
            System.out.println("listenin sonuna yeni bir eleman eklendi");
        }
    }

    void yazdır(){
        if (head==null){
            System.out.println("liste yapisi boş!!!!");
        }
        else {
            Node temp = head;
            System.out.println("\nbas -> ");

            while(temp != null){
                System.out.println(temp.data + " -> " );
                temp = temp.next;
            }
            System.out.println("son");
        }
    }
}
