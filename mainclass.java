import java.util.*;
public class mainclass
{
    public static void main()
    {
        List<student> st = new ArrayList<>();
        st.add(new student(23,"ab"));
        st.add(new student(26,"abc"));
        st.add(new student(24,"acb"));
        st.add(new student(28,"acc"));
        st.add(new student(27,"acc"));
        st.forEach(System.out::println);
        //Collections.sort(st);
        //Collections.sort(st , new sortbynameandthenmarks());
        Collections.sort(st , new Comparator<student>()
        {
           @Override
        public int compare(student o1,student o2)
       {
        if(o1.name.equals(o2.name))
        return o1.marks-o2.marks;
        else
        return o1.name.compareTo(o2.name);
        } 
       }
       );//this is another way of using comparator
        
        st.forEach(System.out::println);
        
    }
}
//example of comparator
/*class sortbynameandthenmarks implements Comparator<student>
{
    @Override
    public int compare(student o1,student o2)
    {
        if(o1.name.equals(o2.name))
        return o1.marks-o2.marks;
        else
        return o1.name.compareTo(o2.name);
    }
}*/
