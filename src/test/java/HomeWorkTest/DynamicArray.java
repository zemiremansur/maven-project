package HomeWorkTest;



      //metoring by ankar

public class DynamicArray<T> {      // T = type of object

    private T[] storage; // underlying array that holds any type
    private int size; // number of elements currently in our array
    private int capacity; // number of elements than CAN be held in our array

    private static final int INITCAP = 2; // initial capacity

    @SuppressWarnings("unchecked")
    public DynamicArray() {
        storage = (T[]) new Object[INITCAP];
        size = 0;
        capacity = INITCAP;
    }

    @SuppressWarnings("unchecked")
    public DynamicArray(int initCapacity) {
        storage = (T[]) new Object[initCapacity];
        size = 0;
        capacity = initCapacity;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return storage.length; // same as return capacity
    }

    // make sure index is valid
    // index >= 0, index = size
    // if index IS INVALID, we want to throw an exception
    // replace whatever is at specified index with value
    // we need to store whatever WAS at the index before we replaced
    public T set(int index, T value) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T temp = storage[index]; // makes sure we can return replaced element
        storage[index] = value; // this line of code does the replacing


        return temp;
    }

    // make sure index is valid
    public T get(int index) {
        try {
            return storage[index];
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }


    // append value to the end of the list
    public void add(T value) {
        // check if underlying array needs to be expanded
        // if it does, create new array and copy all element to new array
        if(size == capacity) {
            changeCapacity();
        }

        // add value to next open spot in our array
        storage[size] = value;
        size++;
    }

    // Check for valid index
    // Two ways to add
    // Appending index == size
    // Inserting index < size
    // then shifting all values of the right of the index TO THE RIGHT
    public void add(int index, T value) {

        if(size == capacity) {
            changeCapacity();
        }

        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }else if(index == size){
            add(value);
        }else {
            for(int i = size; i > index; i--) {
                storage[i] = storage[i - 1]; // shifts elements to the RIGHT
            }
            storage[index] = value;
            size++;
        }



    }

    public T remove(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T temp = storage[index]; // what we are going to return

        if(index < size - 1) { // if we need to shift
            for(int i = index; i < size - 1; i++) {
                storage[i] = storage[i + 1];
            }
        }

        storage[size -1] = null;
        size--;

        return temp;


    }







    @SuppressWarnings("unchecked")
    public void changeCapacity() {
        // create new array that will be larger that the previous underlying array
        T[] temp = (T[]) new Object[2*capacity]; // creates our new underlying array
        capacity *= 2; // updates our capacity field to ensure it is accurate

        for(int i = 0; i < size; i++) { // finished copying all elements to new underyling array
            temp[i] = storage[i];
        }

        storage = temp; // hard copy and soft copies in Java
    }

    @Override
    public String toString() {
        String values= "";
        for(int i = 0; i < size; i++) {
            values += storage[i] + " ";
        }

        return "DynamicArray with size " + size + ", capacity " + capacity + "\n" + values + "\n";
    }

    public static void main(String[] args) {

        DynamicArray<String> dynamicArr = new DynamicArray<>();
        dynamicArr.add("0");
        dynamicArr.add("1");
        System.out.println(dynamicArr);
        dynamicArr.add("3");
        System.out.println(dynamicArr);
        dynamicArr.add("3");
        dynamicArr.add("3");
        dynamicArr.add("3");
        dynamicArr.set(5, "5");
        dynamicArr.add(1, "insert");
        System.out.println(dynamicArr);
        System.out.println(dynamicArr.remove(1));
        System.out.println(dynamicArr);

    }


}