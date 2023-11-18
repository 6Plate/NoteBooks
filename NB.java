package HW6;
public class NB{
int ram;
int hd;
String os;
String color;

public NB( int ram, int hd, String os, String color){
    this.ram = ram;
    this.hd = hd;
    this.os = os;
    this.color = color;
}
@Override
public String toString() {
    return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n ОС %s \n Цвет %s \n Диагональ %.1f \n",
    this.ram, this.hd, this.os, this.color);
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

}

