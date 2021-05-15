class arraynum
{
public int[] plusOne(int[] digits)
{
int x = digits.length; int carry=0; int arr[]= new int[x+1];
for(int i=x-1;i>=0;i--)
{
if(digits[i]!=9)
{digits[i] = digits[i]+1;
break;
}
else
carry ++;
}
if(carry!=x)
{
for(int i=x-1;i>=x-carry;i--)
{
digits[i]=0;
}
return digits;
}
else
{
arr[0] = 1;
return arr;
}
}
}