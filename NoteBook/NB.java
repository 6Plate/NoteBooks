package NoteBook;
 
public class NB{
 private int ram;
 private int hd;
 private String os;
 private String color;

public NB( int ram, int hd, String os, String color){
    this.ram = ram;
    this.hd = hd;
    this.os = os;
    this.color = color;
}

public int getRam(){
    return this.ram;
}
public int getHD(){
    return this.hd;
}
public String getOS(){
    return this.os;
}
public String getColor(){
    return this.color;
}

public String getInfo(){
    StringBuilder sb = new StringBuilder();
    sb.append("оперативная память: \n");
    sb.append(ram);
    sb.append("жесткий диск: \n ");
    sb.append(hd);
    sb.append("операционная система: \n");
    sb.append(os);
    sb.append("цвет: \n ");
    sb.append(color);
    return sb.toString();
}


@Override
    public String toString() {
        return getInfo();
    }

}

