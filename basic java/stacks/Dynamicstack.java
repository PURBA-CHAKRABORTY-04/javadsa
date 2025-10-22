public class Dynamicstack extends stackk{
    public Dynamicstack(){
        
            super();
    }
    public Dynamicstack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
      if(this.isfull()){//dynamic stack so double the array size
        int [] temp=new int[this.data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
       data=temp; 
      } 
        return super.push(item);
    }

}