class DynamicArray {
    int []a;
    int size;
    int capacity;
    public DynamicArray(int capacity) {
        this.capacity=capacity;
        this.a= new int [capacity];
        this.size=0; 
    }

    public int get(int i) {
        return a[i];
    }

    public void set(int i, int n) {
        a[i]=n;
    }

    public void pushback(int n) {
          if(size==capacity){
            resize();
          }  
          a[size]=n;
          size++;
    }

    public int popback() {
      //  int l=a[size]-1;
        size--;
        return a[size];
        
    }

    private void resize() {
        capacity=capacity*2;
        int[] newa=new int [capacity];
        for(int i=0;i<size;i++){
            newa[i]=a[i];
        }
        a=newa;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return a.length;
    }
}
