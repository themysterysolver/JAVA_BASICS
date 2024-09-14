//== -operator compares the bit pattern of 2 reference varaibles(references are the same(references refer to same object in heap))
// .equals() checks the content 
class equality{
    public static void main(String[] args){
        int a=10;
        byte b=11;
        String c="10";
        byte d=10;
        System.out.println((a==b));
        //System.out.println(a==c);  bad operand types for binary operator '=='
        System.out.println(a==d);
        System.out.println(c.equals(a));
        //System.out.println(a.equals(c)); //error: int cannot be dereferenced
    }
}
//The == operator can only compare two operands of compatible types, meaning they need to either both be primitives or both be reference types.
/*a is an int, which is a primitive type. Primitive types (like int, byte, etc.) do not have methods because they are not objects.
The equals() method can only be called on objects, but a is not an object, so calling a.equals(c) results in the error: int cannot be dereferenced.*/