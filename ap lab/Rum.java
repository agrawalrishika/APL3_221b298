class Rum extends Decorator{
Rum(Offering offering){
this.offering = offering;
}
string getName(){
return offering.getName() + "With Rum";
}
int getPrice(){
return offering.getPrice() + 55;
}
}
