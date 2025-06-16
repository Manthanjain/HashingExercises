public record Records(int x, int y){
    public Records{
        if(x<0){
            throw new IllegalArgumentException();
        }
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj== null || this.getClass() != obj.getClass()){
            return false;
        }
        Records records = (Records)(obj);
        return records.x()==this.x() && records.y()==this.y();
    }
}

