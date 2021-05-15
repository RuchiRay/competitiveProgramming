public class linkedlist<g>
{
node<g> head;
void add(g data)
{
node<g> toadd = new node<g>(data);
if(isempty())
{
head = toadd;
return;
}
node<g> temp = head;
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
node<g> temp = head;
while(temp!=null)
{
System.out.println(temp.data+" ");
temp = temp.next;
}
}
node insertAtHead(node<g> list , g data)
{
node<g> toadd = new node<g>(data);
toadd.next = list;
list = toadd;
return list;
}
}
 class node<g>
{
g data;
node<g> next;
public node(g data)
{
this.data = data;
next = null;
}
}