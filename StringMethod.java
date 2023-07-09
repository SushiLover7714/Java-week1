public class StringMethod {
    public static void main(String [] args){
String address= "19 ward,thinganyun street,thuwanna township";
String town1 = "Kyi Myint Daing";
String town2 = "Sanchung";
String town3 = "Thuwanna";
town3 = town3.toLowerCase();
int index = address.indexOf(town1);
if(index <0){

}
else{
System.out.println(index);
}
index = address.indexOf(town2);
if(index <0){

}
else{
System.out.println(index);
}
index = address.indexOf(town3);
if(index <0){

}
else{
System.out.println(index);
System.out.println(address.substring(index,index+town3.length()));
}

    }

}
