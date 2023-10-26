package Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws Exception {
        if(isFull()){
            int[] temp = new int[stack.length * 2];
            for(int i=0;i<stack.length;i++){
                temp[i] = stack[i];
            }
            stack = temp;
            //System.arraycopy(stack, 0, temp, 0, stack.length);
        }
        super.push(item);
        return true;
    }
}
