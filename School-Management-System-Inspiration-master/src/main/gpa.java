package main;


/**
 *
 * @author dell
 */
public class gpa {
    double first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelveth;
    double total,percentage,gpa;
    public gpa(double first ,double second ,double third ,double fourth,double fifth,double sixth,double seventh,double eighth,double ninth,double tenth,double eleventh ,double twelveth){
    this.first=first;
    this.second=second;
    this.third=third;
    this.fourth=fourth;
    this.fifth=fifth;
    
    this.sixth=sixth;
    this.seventh=seventh;
    this.eighth=eighth;
    this.ninth=ninth;
    this.tenth=tenth;
    this.eleventh=eleventh;
    this.twelveth=twelveth;
    
    }
    public double total(){
     this.total=first+second+third+fourth+fifth+sixth+seventh+eighth+ninth+tenth+eleventh+twelveth;
     return total;
    }
    public double percentage(){
     this.percentage=(total/1500)*100;
     return percentage;
    
    }
    public double Gpa(){
     if(first>=143 && first<=150){
     gpa+=3*4.3;} //A+
     else if(first>=136){
     gpa+=3*4;    //A
     }
     else if(first>=128){
     gpa+=3*3.7;  //A-
     }
     else if(first>=123){
     gpa+=3*3.3;  //B+
     }
     else if(first>=118){
     gpa+=3*3;    //B
     }
     else if(first>=112){
     gpa+=3*2.7;   //B-
     }
     else if(first>=107){
     gpa+=3*2.3;   //C+
     }
     else if(first>=102){
     gpa+=3*2.0;   //C
     }
     else if(first>=97){
     gpa+=3*1.7;   //C-
     }
     else if(first>=92){
     gpa+=3*1.3;   //D+
     }
     else if(first>=87){
     gpa+=3*1.0;   //D
     }
     else if(first>=82){
     gpa+=3*0.7;   //D-
     }
     else{
     gpa+=3*0.0;   //F
     }
     
     
     if(second>=143 && second<=150){
     gpa+=3*4.3;}
     else if(second>=136){
     gpa+=3*4;
     }
     else if(second>=128){
     gpa+=3*3.7;
     }
     else if(second>=123){
     gpa+=3*3.3;
     }
     else if(second>=118){
     gpa+=3*3;
     }
     else if(second>=112){
     gpa+=3*2.7;
     }
     else if(second>=107){
     gpa+=3*2.3;
     }
     else if(second>=102){
     gpa+=3*2.0;
     }
     else if(second>=97){
     gpa+=3*1.7;
     }
     else if(second>=92){
     gpa+=3*1.3;
     }
     else if(second>=87){
     gpa+=3*1.0;
     }
     else if(second>=82){
     gpa+=3*0.7;
     }
     else{
     gpa+=3*0.0;
     }
     
    
    if(third>=143 && third<=150){
     gpa+=3*4.3;}
     else if(third>=136){
     gpa+=3*4;
     }
     else if(third>=128){
     gpa+=3*3.7;
     }
     else if(third>=123){
     gpa+=3*3.3;
     }
     else if(third>=118){
     gpa+=3*3;
     }
     else if(third>=112){
     gpa+=3*2.7;
     }
     else if(third>=107){
     gpa+=3*2.3;
     }
     else if(third>=102){
     gpa+=3*2.0;
     }
     else if(third>=97){
     gpa+=3*1.7;
     }
     else if(third>=92){
     gpa+=3*1.3;
     }
     else if(third>=87){
     gpa+=3*1.0;
     }
     else if(third>=82){
     gpa+=3*0.7;
     }
     else{
     gpa+=3*0.0;
     }
    
     if(fourth>=143 && fourth<=150){
     gpa+=3*4.3;}
     else if(fourth>=136){
     gpa+=3*4;
     }
     else if(fourth>=128){
     gpa+=3*3.7;
     }
     else if(fourth>=123){
     gpa+=3*3.3;
     }
     else if(fourth>=118){
     gpa+=3*3;
     }
     else if(fourth>=112){
     gpa+=3*2.7;
     }
     else if(fourth>=107){
     gpa+=3*2.3;
     }
     else if(fourth>=102){
     gpa+=3*2.0;
     }
     else if(fourth>=97){
     gpa+=3*1.7;
     }
     else if(fourth>=92){
     gpa+=3*1.3;
     }
     else if(fourth>=87){
     gpa+=3*1.0;
     }
     else if(fourth>=82){
     gpa+=3*0.7;
     }
     else{
     gpa+=3*0.0;
     }
     
     
      if(fifth>=95 && fifth<=100){
     gpa+=2*4.3;}
     else if(fifth>=90){
     gpa+=2*4;
     }
     else if(fifth>=85){
     gpa+=2*3.7;
     }
     else if(fifth>=82){
     gpa+=2*3.3;
     }
     else if(fifth>=78){
     gpa+=2*3;
     }
     else if(fifth>=75){
     gpa+=2*2.7;
     }
     else if(fifth>=72){
     gpa+=2*2.3;
     }
     else if(fifth>=68){
     gpa+=2*2.0;
     }
     else if(fifth>=65){
     gpa+=2*1.7;
     }
     else if(fifth>=62){
     gpa+=2*1.3;
     }
     else if(fifth>=58){
     gpa+=3*1.0;
     }
     else if(fifth>=55){
     gpa+=2*0.7;
     }
     else{
     gpa+=2*0.0;
     }
      
      
     if(sixth>=47.5 && sixth<=50){
     gpa+=1*4.3;}
     else if(sixth>=45){
     gpa+=1*4;
     }
     else if(sixth>=42.5){
     gpa+=1*3.7;
     }
     else if(sixth>=40.5){
     gpa+=1*3.3;
     }
     else if(sixth>=38.5){
     gpa+=1*3;
     }
     else if(sixth>=36.5){
     gpa+=1*2.7;
     }
     else if(sixth>=34.5){
     gpa+=1*2.3;
     }
     else if(sixth>=32.5){
     gpa+=1*2.0;
     }
     else if(sixth>=30.5){
     gpa+=1*1.7;
     }
     else if(sixth>=28.5){
     gpa+=1*1.3;
     }
     else if(sixth>=26.5){
     gpa+=1*1.0;
     }
     else if(sixth>=25){
     gpa+=1*0.7;
     }
     else{
     gpa+=1*0.0;
     }
     
     
     if(seventh>=143 && seventh<=150){
     gpa+=3*4.3;}
     else if(seventh>=136){
     gpa+=3*4;
     }
     else if(seventh>=128){
     gpa+=3*3.7;
     }
     else if(seventh>=123){
     gpa+=3*3.3;
     }
     else if(seventh>=118){
     gpa+=3*3;
     }
     else if(seventh>=112){
     gpa+=3*2.7;
     }
     else if(seventh>=107){
     gpa+=3*2.3;
     }
     else if(seventh>=102){
     gpa+=3*2.0;
     }
     else if(seventh>=97){
     gpa+=3*1.7;
     }
     else if(seventh>=92){
     gpa+=3*1.3;
     }
     else if(seventh>=87){
     gpa+=3*1.0;
     }
     else if(seventh>=82){
     gpa+=3*0.7;
     }
     else{
     gpa+=3*0.0;
     }
     
     
     if(eighth>=143 && eighth<=150){
     gpa+=3*4.3;}
     else if(eighth>=136){
     gpa+=3*4;
     }
     else if(eighth>=128){
     gpa+=3*3.7;
     }
     else if(eighth>=123){
     gpa+=3*3.3;
     }
     else if(eighth>=118){
     gpa+=3*3;
     }
     else if(eighth>=112){
     gpa+=3*2.7;
     }
     else if(eighth>=107){
     gpa+=3*2.3;
     }
     else if(eighth>=102){
     gpa+=3*2.0;
     }
     else if(eighth>=97){
     gpa+=3*1.7;
     }
     else if(eighth>=92){
     gpa+=3*1.3;
     }
     else if(eighth>=87){
     gpa+=3*1.0;
     }
     else if(eighth>=82){
     gpa+=3*0.7;
     }
     else{
     gpa+=3*0.0;
     }
     
     
     if(ninth>=143 && ninth<=150){
     gpa+=3*4.3;}
     else if(ninth>=136){
     gpa+=3*4;
     }
     else if(ninth>=128){
     gpa+=3*3.7;
     }
     else if(ninth>=123){
     gpa+=3*3.3;
     }
     else if(ninth>=118){
     gpa+=3*3;
     }
     else if(ninth>=112){
     gpa+=3*2.7;
     }
     else if(ninth>=107){
     gpa+=3*2.3;
     }
     else if(ninth>=102){
     gpa+=3*2.0;
     }
     else if(ninth>=97){
     gpa+=3*1.7;
     }
     else if(ninth>=92){
     gpa+=3*1.3;
     }
     else if(ninth>=87){
     gpa+=3*1.0;
     }
     else if(ninth>=82){
     gpa+=3*0.7;
     }
     else{
     gpa+=3*0.0;
     }
     
     
     if(tenth>=143 && tenth<=150){
     gpa+=3*4.3;}
     else if(tenth>=136){
     gpa+=3*4;
     }
     else if(tenth>=128){
     gpa+=3*3.7;
     }
     else if(tenth>=123){
     gpa+=3*3.3;
     }
     else if(tenth>=118){
     gpa+=3*3;
     }
     else if(tenth>=112){
     gpa+=3*2.7;
     }
     else if(tenth>=107){
     gpa+=3*2.3;
     }
     else if(tenth>=102){
     gpa+=3*2.0;
     }
     else if(tenth>=97){
     gpa+=3*1.7;
     }
     else if(tenth>=92){
     gpa+=3*1.3;
     }
     else if(tenth>=87){
     gpa+=3*1.0;
     }
     else if(tenth>=82){
     gpa+=3*0.7;
     }
     else{
     gpa+=3*0.0;
     }
     
     
      if(eleventh>=95 && eleventh<=100){
     gpa+=2*4.3;}
     else if(eleventh>=90){
     gpa+=2*4;
     }
     else if(eleventh>=85){
     gpa+=2*3.7;
     }
     else if(eleventh>=82){
     gpa+=2*3.3;
     }
     else if(eleventh>=78){
     gpa+=2*3;
     }
     else if(eleventh>=75){
     gpa+=2*2.7;
     }
     else if(eleventh>=72){
     gpa+=2*2.3;
     }
     else if(eleventh>=68){
     gpa+=2*2.0;
     }
     else if(eleventh>=65){
     gpa+=2*1.7;
     }
     else if(eleventh>=62){
     gpa+=2*1.3;
     }
     else if(eleventh>=58){
     gpa+=3*1.0;
     }
     else if(eleventh>=55){
     gpa+=2*0.7;
     }
     else{
     gpa+=2*0.0;
     }
      
      
     if(twelveth>=47.5 && twelveth<=50){
     gpa+=1*4.3;}
     else if(twelveth>=45){
     gpa+=1*4;
     }
     else if(twelveth>=42.5){
     gpa+=1*3.7;
     }
     else if(twelveth>=40.5){
     gpa+=1*3.3;
     }
     else if(twelveth>=38.5){
     gpa+=1*3;
     }
     else if(twelveth>=36.5){
     gpa+=1*2.7;
     }
     else if(twelveth>=34.5){
     gpa+=1*2.3;
     }
     else if(twelveth>=32.5){
     gpa+=1*2.0;
     }
     else if(twelveth>=30.5){
     gpa+=1*1.7;
     }
     else if(twelveth>=28.5){
     gpa+=1*1.3;
     }
     else if(twelveth>=26.5){
     gpa+=1*1.0;
     }
     else if(twelveth>=25){
     gpa+=1*0.7;
     }
     else{
     gpa+=1*0.0;
     }
     
     gpa=gpa/30;
     return gpa;
}}
