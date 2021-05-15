public class linked
{
node head;
int data;
node next;
public void node(int data)
{
this.data = data;
next = null;
}
void add(int data)
{
node toadd = new node(data);
if(isempty())
{
head = toadd;
return;
}
node temp = head;
while(temp.next!=null)
{
temp = temp.next;
}
temp.next = toadd;
}
boolean isempty()
{
return head==null;
}
void print()
{
node temp = head;
while(temp!=null)
{
System.out.println(temp.data+" ");
temp = temp.next;
}
}
node insertAtHead(node list , int data)
{
node toadd = new node(data);
toadd.next = list;
list = toadd;
return list;
}
}
 